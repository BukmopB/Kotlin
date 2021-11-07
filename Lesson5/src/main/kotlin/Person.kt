package functional

import lambda.Person

data class Person(val name: String, val age: Int) {

    fun getPersonAge() = age
}

// TODO Person.isAdult age >=18 -> true
fun Person.isAdult() = age >= 18


fun main() {

    val create = ::Person

    val persons = listOf(
        Person("Alice", 29),
        Person("Bob", 31),
        Person("Dima", 14),
        create("Max", 44)
    )

    val alexander = Person("Alexander", 66)
//    println(alexander.isAdult())

    val personIsAdult = Person::isAdult

    // проверки all any none count find
    println(
//        persons.all { it.isAdult() }
        persons.all { it.age > 5 }
    )

    // map - для кажлдого элемента создает новый элемент
    println(
        persons.map { it.name }
    )

    println(
//        persons.filter(personIsAdult).map { it.name }
        persons.filter { it.isAdult() }.map { it.name }
    )

    val sum = {x: Int, y: Int ->
        println("hello!")
        x + y
    }



//    persons.first { it.isAdult() }
    println(persons.firstOrNull { it.age > 200 })
    // persons.last

    // TODO найти элементс с самым коротким именем
    println(
        persons.minBy { it.name.length }
    )
    println(
        persons.maxBy { it.name.length }
    )

    persons.forEach { println(it.name) }

    // filter выпускает только те элементы контейнера, которые соответствуют предикату
    println(
//        persons.filter { it.age < 18 }
//        persons.filter(personIsAdult)
        persons.filter { !it.isAdult() }
//                persons.filter {}  // Cntr + P
    )

    println(
        persons.filter { it.age >= 30 }
    )

    persons.maxBy (Person::age)  // ссылка на функцию класса
    val ageOfAlex = alexander::age  // ссылка на функцию экземпляра
//    val ageOfAlex2 = alexander.getPersonAge  // ?????
    println(
        ageOfAlex.invoke()
    )


    var personOldest = persons[0]
    persons.forEach { p ->
        run {
            if (p.age > personOldest.age) {
                personOldest = p
            }
        }
    }
    println(personOldest)

    println(persons.maxBy { p -> p.age })
    println(persons.maxBy { p -> p.age }?.name)
    println(persons.maxBy { p -> p.age }?.age)


    persons.maxBy { person -> person.age }
    persons.maxBy ({ person -> person.age })
    persons.maxBy (){ person -> person.age }
    persons.maxBy { it.age } // один входной параметр



    val list = listOf(1,2,3,4,5,6)

    println(
        list.reduce { acc, i -> acc + i }
    )
}
