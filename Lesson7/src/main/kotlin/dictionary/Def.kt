package dictionary


import com.google.gson.annotations.SerializedName

data class Def(
    @SerializedName("pos")
    val pos: String,
    @SerializedName("text")
    val text: String,
    @SerializedName("tr")
    val tr: List<Tr>,
    @SerializedName("ts")
    val ts: String
)