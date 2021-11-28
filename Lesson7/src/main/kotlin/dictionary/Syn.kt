package dictionary


import com.google.gson.annotations.SerializedName

data class Syn(
    @SerializedName("asp")
    val asp: String,
    @SerializedName("gen")
    val gen: String,
    @SerializedName("pos")
    val pos: String,
    @SerializedName("text")
    val text: String
)