package myxml

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "catalog")
class Catalog {

    @get:ElementList(required = false, inline = true)
    @set:ElementList(required = false, inline = true)
    var books : MutableList<Book>? = null
}

class Book
{
    @set:Attribute(required = false)
    @get:Attribute(required = false)
    var id : String ? = null

    @set:Element(required = false)
    @get:Element(required = false)
    var author : String ? = null

}