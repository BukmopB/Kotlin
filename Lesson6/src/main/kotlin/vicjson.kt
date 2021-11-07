import com.google.gson.Gson
import vicjson.Glossary

val vicjson : String = """
    {
        "glossary": {
            "title": "example glossary",
            "GlossDiv": {
                "title": "S",
                "GlossList": {
                    "GlossEntry": {
                        "ID": "SGML",
                        "SortAs": "SGML",
                        "GlossTerm": "Standard Generalized Markup Language",
                        "Acronym": "SGML",
                        "Abbrev": "ISO 8879:1986",
                        "GlossDef": {
                            "para": "A meta-markup language, used to create markup languages such as DocBook.",
                            "GlossSeeAlso": ["GML", "XML"]
                        },
                        "GlossSee": "markup"
                    }
                }
            }
        }
    }
""".trimIndent()

fun main() {
    val gson = Gson()

    val vicglossary = gson.fromJson<Glossary>(vicjson, Glossary::class.java)

    vicglossary?.glossary?.glossDiv?.glossList?.glossEntry?.glossDef?.glossSeeAlso?.forEach { println(it) }
}
