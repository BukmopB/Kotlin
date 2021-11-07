package myjson


import com.google.gson.annotations.SerializedName

data class GlossaryX(
    @SerializedName("GlossDiv")
    val glossDiv: GlossDiv,
    @SerializedName("title")
    val title: String
)