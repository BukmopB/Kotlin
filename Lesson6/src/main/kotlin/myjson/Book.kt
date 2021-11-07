package myjson


import com.google.gson.annotations.SerializedName

data class Book(
    @SerializedName("author")
    val author: String,
    @SerializedName("edition")
    val edition: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("language")
    val language: String
)