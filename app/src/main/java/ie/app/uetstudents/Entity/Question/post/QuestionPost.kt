package ie.app.uetstudents.Entity.Question.post

data class QuestionPost(
    val account: Account,
    val category: Category?,
    val content: String,
    val title: String,
    val type_content: TypeContent
)