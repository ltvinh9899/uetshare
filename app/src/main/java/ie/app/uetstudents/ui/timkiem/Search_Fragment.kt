package ie.app.uetstudents.ui.timkiem

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.*
import android.widget.SearchView
import android.widget.Toast
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import ie.app.uetstudents.R
import ie.app.uetstudents.Repository.Repository
import ie.app.uetstudents.data.response.AccountDto
import ie.app.uetstudents.Entity.Search.Question.QuestionDto
import ie.app.uetstudents.Entity.Search.Question.search_question
import ie.app.uetstudents.Entity.Search.person.person
import ie.app.uetstudents.utils.PreferenceUtils
import kotlinx.android.synthetic.main.searchdialog_fullscreen.*

class Search_Fragment: Fragment() ,OnCLickItem_search , OnClickItem_SearchPerson,SearchContract.View{

    private var page_search : Int = 1
    private var type_content_id : Int = 1

    private lateinit var presenter: SearchContract.Presenter
    private lateinit var adapter_person: adapter_search_person
    private lateinit var adapter_question : adapter_search

    var id_user : Int ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        id_user = PreferenceUtils.getUser().id
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.searchdialog_fullscreen,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*-----------------------Xử lý khi click chọn kiểu search--------------------------*/
        search_forum.setOnClickListener {
            type_content_id = 1
            Toast.makeText(context,"Đã chọn tìm kiếm diễn đàn",Toast.LENGTH_SHORT).show()
            search_forum.isChecked = true
            search_person.isChecked = false
            search_uettalk.isChecked = false

        }
        search_uettalk.setOnClickListener {
            type_content_id = 2
            Toast.makeText(context,"Đã chọn tìm kiếm Bài viết UETTalk",Toast.LENGTH_SHORT).show()
            search_forum.isChecked = false
            search_person.isChecked = false
            search_uettalk.isChecked = true
        }
        search_person.setOnClickListener {
            type_content_id = 3
            Toast.makeText(context,"Đã chọn tìm kiếm Người dùng",Toast.LENGTH_SHORT).show()
            search_forum.isChecked = false
            search_person.isChecked = true
            search_uettalk.isChecked = false
        }


        /*-----------------------------Sử lý search--------------------------------------*/

        presenter = SearchPresenter(this, Repository(requireContext()))



        searchview.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                getdulieusearch(page_search,query!!,type_content_id)
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                getdulieusearch(page_search,newText!!,type_content_id)

                search_scrollview.setOnScrollChangeListener(object : NestedScrollView.OnScrollChangeListener{
                    override fun onScrollChange(
                        v: NestedScrollView?,
                        scrollX: Int,
                        scrollY: Int,
                        oldScrollX: Int,
                        oldScrollY: Int
                    ) {
                        if (scrollY == v?.getChildAt(0)?.measuredHeight?.minus(v!!?.measuredHeight) ?: Int)
                        {
                            page_search++
                            getdulieusearch(page_search,newText,type_content_id)

                        }
                    }
                })

                return false
            }
        })


    }
/*---------------------------------Lấy dữ liệu search------------------------------------*/
    private fun getdulieusearch(page : Int , textsearch: String,type_content_id : Int) {
        if(type_content_id == 1 ||type_content_id == 2)
        {
            adapter_question = adapter_search(this)
            presenter.getQuestions(page,textsearch,type_content_id,id_user!!)
            search_recyclerview.layoutManager = LinearLayoutManager(context)
            search_recyclerview.adapter = adapter_question

        }else if (type_content_id == 3)
        {

            adapter_person = adapter_search_person(this)
            presenter.getPersonsearch(page,textsearch)
            search_recyclerview.layoutManager = LinearLayoutManager(context)
            search_recyclerview.adapter = adapter_person
        }

    }
    override fun onPrepareOptionsMenu(menu: Menu) {
        super.onPrepareOptionsMenu(menu)
        val item1 : MenuItem = menu.findItem(R.id.action_search)
        val item2 : MenuItem = menu.findItem(R.id.action_notification)
        val item3 : MenuItem = menu.findItem(R.id.action_profile)
        item1.setVisible(false)
        item2.setVisible(false)
        item3.setVisible(false)
    }

    override fun Onclick(Questiontdo: QuestionDto) {
        val bundle = Bundle()
        bundle.putInt("id_question",Questiontdo.id)
        bundle.putString("owner_username",Questiontdo.accountDto?.username ?: "")
        this.findNavController().navigate(R.id.action_search_Fragment_to_detailForumFragment,bundle)
    }


    override fun UpdateViewPerson(person: person) {
        adapter_person.setData(person.accountDtoList)
        search_recyclerview.adapter?.notifyDataSetChanged()
    }

    override fun UpdateViewQuestion(searchQuestion: search_question) {
        adapter_question.setDataQuestion(searchQuestion.questionDtoList)
        search_recyclerview.adapter?.notifyDataSetChanged()
    }

    override fun ClickItem(AccountDto: AccountDto) {
        Toast.makeText(context,AccountDto.username,Toast.LENGTH_SHORT).show()
        val bundle : Bundle = Bundle()
        bundle.putInt("id_user",AccountDto.id)
        this.findNavController().navigate(R.id.action_action_search_to_action_profile,bundle)
    }
}
