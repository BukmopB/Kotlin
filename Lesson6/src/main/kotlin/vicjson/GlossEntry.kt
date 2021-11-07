package vicjson


import com.google.gson.annotations.SerializedName

data class GlossEntry(
    @SerializedName("Abbrev")
    val abbrev: String,
    @SerializedName("Acronym")
    val acronym: String,
    @SerializedName("GlossDef")
    val glossDef: GlossDef,
    @SerializedName("GlossSee")
    val glossSee: String,
    @SerializedName("GlossTerm")
    val glossTerm: String,
    @SerializedName("ID")
    val iD: String,
    @SerializedName("SortAs")
    val sortAs: String
)