package dictionary


import com.google.gson.annotations.SerializedName

data class DictionaryResult(
    @SerializedName("def")
    val def: List<Def>,
    @SerializedName("head")
    val head: Head
)