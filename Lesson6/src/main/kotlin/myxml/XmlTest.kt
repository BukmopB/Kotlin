package myxml

import org.simpleframework.xml.Serializer
import org.simpleframework.xml.core.Persister
import java.io.StringWriter
import java.io.Writer

val xml = """
<catalog>
   <book id="bk101">
      <author>Gambardella, Matthew</author>
   </book>
   <book id="bk102">
      <author>Ralls, Kim</author>
   </book>
</catalog>    
""".trimIndent()

fun main()
{
    val serilizer : Serializer = Persister()
    var catalog : Catalog = serilizer.read(Catalog::class.java, xml)
    catalog?.books?.forEach { println(it.id) }


    val myCatalog = Catalog()
    val book = Book()
    book.id = "myid"
    book.author = "Gremlin"
    myCatalog.books = mutableListOf<Book>(book)

    var writer =StringWriter()
    serilizer.write(myCatalog, writer)
    println(writer.toString())

}