package myjson


import com.google.gson.annotations.SerializedName

data class GlossList(
    @SerializedName("GlossEntry")
    val glossEntry: GlossEntry
)