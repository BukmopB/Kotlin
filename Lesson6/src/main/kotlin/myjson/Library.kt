package myjson


import com.google.gson.annotations.SerializedName

data class Library(
    @SerializedName("age")
    val age: Int,
    @SerializedName("books")
    val books: List<Book>,
    @SerializedName("owner")
    val owner: String
)