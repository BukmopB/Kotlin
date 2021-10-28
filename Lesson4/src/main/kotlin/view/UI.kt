package view

import JavaClickListener
import JavaView

data class Person(val name: String, val age : Int)

val people = listOf(
    Person("Alice", 29),
    Person("Bob", 31),
    Person("Carol", 31)
)

fun hi() = println("hi")

fun Person.isAdult() : Boolean = age >= 18

fun main()
{
    val create = ::Person
    val adult = Person::isAdult
    val  max = create("Max", 23)
    println( adult(max)   )
    val maxage = max::age
    println( maxage()   )

/*






    val hello = ::hi
    run(hello)

    val personAge = Person::age

    var counter = 0
    people.forEach {
        counter++
    }
    println(counter)
*/

/*
    val ageSort = {p:Person -> p.age}

    println (
        // people.minBy( {  p:Person -> p.age   } )
        // people.minBy() {  p:Person -> p.age   }
        // people.minBy {  p:Person -> p.age   }
        // people.minBy {  p -> p.age   }
        // people.minBy {  it.age   }
        // people.minBy (  Person::age   )
        people.minBy    (  ageSort   )
    )
*/

/*
    val sum = {    x: Int, y: Int ->
        println("hello")
        x + y    }

    println( sum(20, 10)  )


    // { println("hello") } ()

    run { println("hello") }


    val javaView  = JavaView()
    javaView.setOnClickListener(
        object : JavaClickListener {
            override fun onClick(view: JavaView?) {}
        }
    )

    javaView.setOnClickListener { view -> print("hello") }

*/


}