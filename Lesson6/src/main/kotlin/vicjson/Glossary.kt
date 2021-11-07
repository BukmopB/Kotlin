package vicjson


import com.google.gson.annotations.SerializedName

data class Glossary(
    @SerializedName("glossary")
    val glossary: GlossaryX
)