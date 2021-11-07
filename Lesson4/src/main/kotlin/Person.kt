import javax.print.attribute.standard.MediaSize

//class Person(val name: String, val zip: Int) {
//    override fun toString() = "$name $zip"
//    override fun equals(other: Any?): Boolean {
//        if (other == null || other !is Person)
//            return false
//        return name == other.name && zip == other.zip
//    }
//
//    override fun hashCode(): Int = name.hashCode() * 31 + zip
//}

data class Person(val name: String, val zip: Int)

fun main() {

    val dima1 = Person("Dima", 111)
    val dima2 = Person("Dima", 111)

    val (name, zip)  = dima1

    val set = hashSetOf(dima1)
    println(set.contains(dima2))

    println(dima1 == dima2)

    // копирующий конструктор
    val dima3 = dima1.copy(name = "Max")



//    val persons = mutableListOf(
    val persons = listOf(
        Person("Sergey", 112233),
        Person("Alexandra", 444555),
        Person("Gleb", 222555)
    )

//    persons.add(Person("Sig", 333222))
//    persons[2].name = "Crocodile"

    val sorted = persons.sortedWith(object : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int {
            return o1.name.compareTo(o2.name)
        }
    })

    println(sorted)
}