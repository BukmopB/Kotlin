import com.google.gson.Gson
import myjson.Glossary
import myjson.Library

val json = """
{
   "owner": "John Smith",
   age: 55,
   "books":[
      {
         "id":"444",
         "language":"C",
         "edition":"First",
         "author":"Dennis Ritchie "
      },
      {
         "id":"555",
         "language":"C++",
         "edition":"second",
         "author":" Bjarne Stroustrup "
      }
   ]
}    
""".trimIndent()

val glossary = """
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


data class Person(val name: String, val age: Int)

fun main()
{
    val gson = Gson()
    val library = gson.fromJson<Library>(json, Library::class.java)
    library?.books?.forEach { println(it.author) }

    val glossary = gson.fromJson<Glossary>(glossary, Glossary::class.java)
    glossary.glossary.glossDiv.glossList.glossEntry.glossDef.glossSeeAlso.forEach { println(it) }


    val  persons = listOf(Person("dima", 19), Person("masha", 26))


    println(
        gson.toJson(persons)
    )

}