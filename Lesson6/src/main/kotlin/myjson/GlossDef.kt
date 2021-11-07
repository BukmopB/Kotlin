package myjson


import com.google.gson.annotations.SerializedName

data class GlossDef(
    @SerializedName("GlossSeeAlso")
    val glossSeeAlso: List<String>,
    @SerializedName("para")
    val para: String
)