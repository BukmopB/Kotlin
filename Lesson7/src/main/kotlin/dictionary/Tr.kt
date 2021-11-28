package dictionary


import com.google.gson.annotations.SerializedName

data class Tr(
    @SerializedName("asp")
    val asp: String,
    @SerializedName("ex")
    val ex: List<Ex>,
    @SerializedName("gen")
    val gen: String,
    @SerializedName("mean")
    val mean: List<Mean>,
    @SerializedName("pos")
    val pos: String,
    @SerializedName("syn")
    val syn: List<Syn>,
    @SerializedName("text")
    val text: String
)