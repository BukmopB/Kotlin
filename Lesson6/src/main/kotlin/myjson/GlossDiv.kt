package myjson


import com.google.gson.annotations.SerializedName

data class GlossDiv(
    @SerializedName("GlossList")
    val glossList: GlossList,
    @SerializedName("title")
    val title: String
)