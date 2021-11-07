package lambda

data class Person(val name: String, val age: Int)

val nullableList : List<  Int?  > = listOf(1,2 ,3, null, 6, 8)

val nullableList1 : List<  Int?  > ? = listOf()



val people = listOf(
    Person("Alice",29),
    Person("Bob", 31),
    Person("Carol", 31)
)


val listOfList = listOf(
    listOf("abc", "kgb", "cia"),
    listOf("ibm", "kpmg")
)

val map = mapOf(1 to "one", 2 to "two", 3 to "three")
val list = listOf(1, 2, 3, 4, 5, 6, 7, 2,3,4)
fun main()
{


    println(
        listOfList.flatten()
    )

    println(
        listOfList.flatten().map { it.toList() }
    )

    println(                  // (1, 2,      3,        4, 5, 6, 7, 2,3,4)
        // listOfList.flatten().flatMap { it.toList() }
        people.zip(list)
        // people.partition { it.age < 15 }
        // people.groupBy { it.age }.keys
        // people.associateBy { it.age }
        // fold reduce              1*2=2   2*3=6     6*4
        // list.reduce           { acc: Int, elem : Int -> acc * elem  }
        // list.fold( 1,      { acc: Int, elem : Int -> acc * elem  }  )
        // list.fold( 1)   { acc: Int, elem : Int -> acc * elem  }
        // any none all
        // people.any { it.age == 29}
        // people.count { it.age == 31 }
        // people.find { it.age == 31 && it.name.contains('o') }
        // people.map { it-> it.age.toFloat() }.average()
        // people.map { it-> it.age }.sum()
        // people.sumBy { it.age }
        //map.mapValues { it.value.toUpperCase() }
        // list.map { it * it }
        // people.filter { it.age > 30 } .map { it.name }
        // list.distinct() // distinctBy
        // people.maxBy { it.age }?.age // minBy
        // people.first{ it.age == 60} // NoSuchElementException last
        // people.firstOrNull{ it.age == 60} // null lastOrNull
        // list.filter { x:Int -> x % 3 == 0 }
        // list.filter { x -> x % 3 == 0 }
        // list.filter { it % 3 == 0 }
        // people.filter { it.age > 30 }
        // nullableList.filter{ x -> x != null && x % 3 == 0 }
        // nullableList1?.filter{ x -> x != null && x % 3 == 0 }
    )


    /*
    val sum : (Int, Int) -> Int         =   { x: Int, y: Int -> x + y }

    val some : () -> Unit            =   {  println("hello") }
    sum(1, 2)
    // Function1
    // Function2
    sum.invoke(4,5)
*/


}