package ie.app.uetstudents.ui.uettalk

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.gson.Gson
import ie.app.uetstudents.R
import ie.app.uetstudents.RealPathUtil.RealPathUtil
import ie.app.uetstudents.Repository.Repository
import ie.app.uetstudents.adapter.*
import ie.app.uetstudents.databinding.FragmentUettalkBinding
import ie.app.uetstudents.ui.API.ApiClient
import ie.app.uetstudents.ui.API.ApiClient.BASE_URL
import ie.app.uetstudents.ui.Entity.Comment.get.CommentDto
import ie.app.uetstudents.ui.Entity.Comment.post.Question
import ie.app.uetstudents.ui.Entity.Comment.post.comment_post
import ie.app.uetstudents.ui.Entity.Question.get.ImageDto
import ie.app.uetstudents.ui.Entity.Question.get.QuestionDtoX
import ie.app.uetstudents.ui.Entity.Question.get.question
import ie.app.uetstudents.ui.Entity.like.Post.Account
import ie.app.uetstudents.ui.Entity.like.Post.Comment
import ie.app.uetstudents.ui.Entity.like.Post.like_comment
import ie.app.uetstudents.ui.Entity.like_question.post.like_question
import ie.app.uetstudents.ui.Entity.notifications_comment.post.post_notifi_comment
import ie.app.uetstudents.ui.Entity.notifications_question.post.notification_question_post
import ie.app.uetstudents.ui.diendan.detailForum.DetailForumContract
import ie.app.uetstudents.ui.diendan.detailForum.DetailForumPresenter
import ie.app.uetstudents.ui.diendan.forum_main.forumContract
import ie.app.uetstudents.ui.diendan.forum_main.forumPresenter
import ie.app.uetstudents.ui.tailieu.detailPDF
import ie.app.uetstudents.utils.PreferenceUtils
import kotlinx.android.synthetic.main.fragment_uettalk.*
import kotlinx.android.synthetic.main.fragment_uettalk.view.*
import kotlinx.android.synthetic.main.layout_bottomsheet.*
import kotlinx.android.synthetic.main.sheetbottom_comment_uettalk.*
import kotlinx.android.synthetic.main.sheetbottom_comment_uettalk.view.*
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.File

class UETTalkFragment : Fragment(), forumContract.View, OnClickItem_UetTalk,
    DetailForumContract.View,
    ClickItemCommentLike, BaseAdapter.OnclickPdf<ImageDto> {

    private val CAMERA_REQUEST: Int = 8888
    private var _binding: FragmentUettalkBinding? = null

    private val binding get() = _binding!!

    private lateinit var presenter: forumContract.Presenter
    private lateinit var adapter_uettalk: AdapterUETTalk

    private var bottomSheetDialog: BottomSheetDialog? = null
    private lateinit var adapter_comment_uettalk: CommentAdapter
    private lateinit var presenter_uettalk_comment: DetailForumContract.Presenter

    private lateinit var bottomSheetView: View

    private var page_comment: Int = 1
    private var page_uettalk: Int = 1
    var id_user : Int? = null

    var uri: Uri? = null


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

        _binding = FragmentUettalkBinding.inflate(inflater, container, false)
        val root: View = binding.root

        presenter = forumPresenter(this, Repository(requireContext()))
        presenter_uettalk_comment = DetailForumPresenter(this, Repository(requireContext()))


        presenter.getQuestions(2, page_uettalk,id_user!!)
        adapter_uettalk = AdapterUETTalk(requireContext(),this,this)
        root.recyclerview_item_uettalk.layoutManager = LinearLayoutManager(requireContext())
        root.recyclerview_item_uettalk.isNestedScrollingEnabled = false


        root.recyclerview_item_uettalk.adapter = adapter_uettalk
        root.recyclerview_item_uettalk.scrollToPosition(0)
        root.uettalk_scrollview.setOnScrollChangeListener(object :
            NestedScrollView.OnScrollChangeListener {
            override fun onScrollChange(
                v: NestedScrollView?,
                scrollX: Int,
                scrollY: Int,
                oldScrollX: Int,
                oldScrollY: Int
            ) {
                if (scrollY == v?.getChildAt(0)?.measuredHeight?.minus(v!!?.measuredHeight) ?: Int) {
                    page_uettalk++
                    root.uet_talk_progressbar.visibility = View.VISIBLE
                    presenter.getQuestions(2, page_uettalk,id_user!!)
                }
            }
        })

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val user = PreferenceUtils.getUser()
        val urlAvatar = "${BASE_URL}image${user.avatar}"

        Glide.with(requireContext())
            .load(urlAvatar)
            .placeholder(R.drawable.img_default_user)
            .error(R.drawable.img_default_user)
            .into(image_uettalk)

        status_uettalk.setOnClickListener {
            this.findNavController().navigate(R.id.action_nav_uettalk_to_writingStatusFragment)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    /*-----------------update dữ liệu question vào Layout -----------------------------------*/
    override fun updateViewData(data: question) {
        uet_talk_progressbar?.visibility = View.GONE
        adapter_uettalk.setData(data.questionDtoList)
        recyclerview_item_uettalk?.adapter?.notifyDataSetChanged()
    }

    /*-----------------------Click vào btn thích------------------------------------*/
    override fun ClickItem_like(QuestionDto: QuestionDtoX) {
        if(QuestionDto.liked == false)
        {
            QuestionDto.liked = true
            PostApiLike(QuestionDto.id, QuestionDto.accountDto?.username ?: "", id_user!!)
            update_notification("LIKE", QuestionDto.id!!, PreferenceUtils.getUser().username.toString(), QuestionDto.accountDto?.username ?: "")
        }else
        {
            QuestionDto.liked=false
            deleteLikeQuestion(id_user!!,QuestionDto.id)
        }


    }

    /*-----------------------Chuyenr đến bottomsheet comment--------------------------------*/
    override fun ClickItem_comment(QuestionDto: QuestionDtoX) {
        // Toast.makeText(context,"Bình luận",Toast.LENGTH_LONG).show()
        //presenter_uettalk_comment = DetailForumPresenter(this, Repository(requireContext()))


        adapter_comment_uettalk = CommentAdapter(this)


        bottomSheetDialog = BottomSheetDialog(
            this@UETTalkFragment.requireContext(), R.style.BottomSheetDialogTheme
        )
        bottomSheetView = LayoutInflater.from(requireContext())
            .inflate(R.layout.sheetbottom_comment_uettalk, bottomsheet_uettalk)

        bottomSheetView.comment_recyclerview_uettalk.layoutManager =
            LinearLayoutManager(context)

        presenter_uettalk_comment.getDetailComment(QuestionDto.id?.toInt()!!, page_comment,id_user!!)
        bottomSheetView.comment_recyclerview_uettalk.isNestedScrollingEnabled = false
        bottomSheetView.comment_recyclerview_uettalk.adapter = adapter_comment_uettalk
        bottomSheetView.comment_recyclerview_uettalk.adapter?.notifyDataSetChanged()

        bottomSheetView.comment_scrollview.setOnScrollChangeListener(object :
            NestedScrollView.OnScrollChangeListener {
            override fun onScrollChange(
                v: NestedScrollView?,
                scrollX: Int,
                scrollY: Int,
                oldScrollX: Int,
                oldScrollY: Int
            ) {
                if (scrollY == v?.getChildAt(0)?.measuredHeight?.minus(v!!?.measuredHeight) ?: Int) {
                    page_comment++
                    bottomSheetView.comment_progressbar.visibility = View.VISIBLE
                    presenter_uettalk_comment.getDetailComment(QuestionDto.id, page_comment,id_user!!)
                }

            }
        })

        bottomSheetView.comment_uet_camera.setOnClickListener {
//            val cameraIntent =
//                Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
//            startActivityForResult(cameraIntent, CAMERA_REQUEST)
            if (activity?.checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                openGallery()
            } else {
                requestPermissions(arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), 261)
            }
        }

        bottomSheetView.btn_update_comment_uettalk.setOnClickListener {


            Log.e("uri", uri.toString())
            xulybtncommemt(QuestionDto.id, QuestionDto.accountDto?.username ?: "" , uri)
        }

        bottomSheetDialog!!.setContentView(bottomSheetView)
        bottomSheetDialog!!.show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK && data != null) {
            uri = data.data
            Toast.makeText(context, "Đã thêm ảnh vào bình luận!", Toast.LENGTH_LONG).show()
            Log.e("uri", uri.toString())
        }
    }

    /*------------------------Click vao itemUet chuyển sang DetailFragment-------------------------------*/
    override fun ClickItem_uettalk(QuestionDto: QuestionDtoX) {
        val bundle = Bundle()
        bundle.putInt("id_question", QuestionDto.id!!)
        Toast.makeText(context, QuestionDto.id.toString(), Toast.LENGTH_SHORT).show()
        this.findNavController().navigate(R.id.action_nav_uettalk_to_detailForumFragment, bundle)
    }

    override fun getDataView(data: QuestionDtoX) {

    }

    /*------------------------update data comment----------------------------------------*/
    override fun getDataViewComment(datacomment: ie.app.uetstudents.ui.Entity.Comment.get.Comment) {
        // bottomSheetView.comment_processbar.progress = View.GONE
        bottomSheetView.comment_progressbar.visibility = View.GONE
        if (datacomment.commentDtoList.isEmpty()) {
            Toast.makeText(context, "trống", Toast.LENGTH_LONG).show()
            bottomSheetView.txt_comment_chuacobinhluan.text = "Chưa có bình luận nào!"
        } else {
            adapter_comment_uettalk.setData(datacomment.commentDtoList as ArrayList<CommentDto>)
            Toast.makeText(context, "đã có dữ liệu", Toast.LENGTH_LONG).show()
            bottomSheetView.comment_recyclerview_uettalk.adapter?.notifyDataSetChanged()
        }
    }


    /*--------------------Post Like comment------------------------------*/
    override fun clickOnItem(m: ie.app.uetstudents.ui.Entity.Comment.get.CommentDto) {
        val idcomment = Comment(m.id!!.toInt())
        val account = Account(null)
        val likeComment = like_comment(account, idcomment)
        val call: Call<like_comment> = ApiClient.getClient.setLikeComment(likeComment)
        call.enqueue(object : Callback<like_comment> {
            override fun onResponse(call: Call<like_comment>, response: Response<like_comment>) {
                if (response.isSuccessful) {
                    val notifi_item = post_notifi_comment(
                        "LIKE",
                        "",
                        ie.app.uetstudents.ui.Entity.notifications_comment.post.Comment(m.id),
                        PreferenceUtils.getUser().username.toString()
                    )
                    presenter_uettalk_comment.setNotificationComment(notifi_item)
                }
                Log.e("Test_API_Like_Comment", "Thành công")
            }

            override fun onFailure(call: Call<like_comment>, t: Throwable) {
                Log.e("Test_API_Like_Comment", "Thất bại")
            }
        })
    }

    /*--------------------------------Xử lý khi click btn đăng binh luận-----------------------------------------*/
    fun xulybtncommemt(id_question: Int, owner_username: String , uri: Uri?) {
        if (bottomSheetView.edt_comment_uettalk.text.isEmpty()) {
            Toast.makeText(context, "Bạn Chưa nhập bình luận!", Toast.LENGTH_LONG).show()
        } else {
            val commentpost = comment_post(
                ie.app.uetstudents.ui.Entity.Comment.post.Account(PreferenceUtils.getUser().id),
                bottomSheetView.edt_comment_uettalk.text.toString(),
                Question(id_question)
            )
            val gson = Gson()
            val commentstr = gson.toJson(commentpost).toString()

            val builder = MultipartBody.Builder()
            builder.setType(MultipartBody.FORM)
            builder.addFormDataPart("Comment", commentstr)

            uri?.let {
                val realpathutil = uri.let { RealPathUtil.getRealPath(requireContext(), it) }
                val file = File(realpathutil)
                builder.addFormDataPart(
                    "image_file",
                    file.name,
                    RequestBody.create(MediaType.parse("multipart/form-data"), file)
                )
            }



            val call: Call<ie.app.uetstudents.ui.Entity.Comment.get.Comment> =
                ApiClient.getClient.setCommentQuestion(builder.build())
            call.enqueue(object : Callback<ie.app.uetstudents.ui.Entity.Comment.get.Comment> {
                override fun onResponse(
                    call: Call<ie.app.uetstudents.ui.Entity.Comment.get.Comment>,
                    response: Response<ie.app.uetstudents.ui.Entity.Comment.get.Comment>
                ) {
                    Log.e("Test", "thành công")
                    Toast.makeText(context, "bình luận thành công!", Toast.LENGTH_LONG).show()
                    if (response.isSuccessful) {
                        update_notification(
                            "COMMENT",
                            id_question,
                            PreferenceUtils.getUser().username.toString(),
                            owner_username
                        )
                    }
                }

                override fun onFailure(
                    call: Call<ie.app.uetstudents.ui.Entity.Comment.get.Comment>,
                    t: Throwable
                ) {
                    Log.e("Test", "thất bại")
                }
            })
            bottomSheetView.edt_comment_uettalk.text.clear()


            bottomSheetView.comment_progressbar.visibility = View.VISIBLE

            val call_get: Call<ie.app.uetstudents.ui.Entity.Comment.get.Comment> =
                ApiClient.getClient.getCommentQuestion(id_question, page_comment,id_user!!)
            call_get.enqueue(object : Callback<ie.app.uetstudents.ui.Entity.Comment.get.Comment> {
                override fun onResponse(
                    call: Call<ie.app.uetstudents.ui.Entity.Comment.get.Comment>,
                    response: Response<ie.app.uetstudents.ui.Entity.Comment.get.Comment>
                ) {
                    if (response.isSuccessful) {
                        adapter_comment_uettalk.setData(response.body()?.commentDtoList!! as ArrayList<CommentDto>)
                        bottomSheetView.comment_recyclerview_uettalk?.adapter?.notifyDataSetChanged()
                        bottomSheetView.comment_progressbar.visibility = View.GONE
                    }
                }

                override fun onFailure(
                    call: Call<ie.app.uetstudents.ui.Entity.Comment.get.Comment>,
                    t: Throwable
                ) {
                    Log.e("Test", "lỗi rồi")
                }
            })
            bottomSheetView.recyclerview_item_uettalk?.scrollToPosition(0)
        }
    }

    /*---------------------------Update thông báo Question---------------------------------*/

    fun update_notification(type_action: String, id_question: Int, username: String, owner_username : String) {
        if (PreferenceUtils.getUser().avatar != null)
        {
            val notifi_item = notification_question_post(
                type_action,
                PreferenceUtils.getUser().avatar.toString(),
                ie.app.uetstudents.ui.Entity.notifications_question.post.Question(id_question),
                username,
                owner_username
            )
            presenter_uettalk_comment.setNotificationQuestion(notifi_item)
        }else
        {
            val notifi_item = notification_question_post(
                type_action,
                null,
                ie.app.uetstudents.ui.Entity.notifications_question.post.Question(id_question),
                username,
                owner_username
            )
            presenter_uettalk_comment.setNotificationQuestion(notifi_item)
        }

    }

    fun openGallery() {
        val intent: Intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        //mActivityResultLauncher.launch(Intent.createChooser(intent,"select picture"))
        startActivityForResult(Intent.createChooser(intent, "select picture"), CAMERA_REQUEST)
    }

    /*-----------------Post like lên server-------------------*/
    fun PostApiLike(id_question: Int, owner_username: String,  id_account: Int) {
        val account = ie.app.uetstudents.ui.Entity.like_question.post.Account(id_account)
        val question = ie.app.uetstudents.ui.Entity.like_question.post.Question(id_question)
        val likeQuestion = like_question(account, question)
        val call: Call<like_question> = ApiClient.getClient.postlikequestion(likeQuestion)
        call.enqueue(object : Callback<like_question> {
            override fun onResponse(call: Call<like_question>, response: Response<like_question>) {
                if (response.isSuccessful) {
                    update_notification(
                        "LIKE",
                        id_question,
                        PreferenceUtils.getUser().username.toString(),
                        owner_username
                    )
                    Log.e("Test_PostLike", "thành công")
                }
            }

            override fun onFailure(call: Call<like_question>, t: Throwable) {
                Log.e("Test_postlike", "thất Bại")
            }
        })
    }

    /*-------------------Delete like----------------------------*/
    fun deleteLikeQuestion(account_id: Int,id_question: Int)
    {
        val call: Call<like_question> =
            ApiClient.getClient.deletelikeQueston(account_id, id_question)
        call.enqueue(object : Callback<like_question> {
            override fun onResponse(
                call: Call<like_question>,
                response: Response<like_question>
            ) {
                if (response.isSuccessful) {
                    Log.e("Test_bỏ_like", "Thành CÔng")
                }
            }

            override fun onFailure(call: Call<like_question>, t: Throwable) {
                Log.e("Test_bỏ_like", "Thất bại")
            }
        })
    }

    override fun onItemClick(position: Int, item: ImageDto) {

        val intent = Intent(activity, detailPDF::class.java)
        intent.putExtra("ExamDocument",item.image)
        startActivity(intent)
    }


}
