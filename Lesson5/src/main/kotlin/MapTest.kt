package functional

import lambda.Person
import kotlin.math.max

val map = mapOf(1 to "one", 2 to "two")

val persons = listOf(
    Person("Alice", 29),
    Person("Bob", 31),
    Person("Dima", 31),
    Person("Max", 44)
)

val list = listOf(1,2,3,4,5)
val listOfList = listOf(
    listOf("dima", "max"),
    listOf("katya", "lena")
)

fun main () {

    // filterKeys filterValues filter

    // TODO отфильтровать только содержащие  букву "t" в значении
    println(
//        map.filterValues { it.contains('t') }
        map.filter { it.value.contains('t') }
    )

    // TODO значения в верхний регистр
    println(
//        map.mapValues { it.value.toUpperCase()}
        map.map { pair -> pair.key to pair.value.toUpperCase()}
    )

    // count countBy average sum sumBy
    // TODO сумму длин значений
    println(
        map.map { it.value }.sumBy { it.length }
//         map.asSequence().first()
    )

    // групировка
    println(
//        persons.groupBy { it.age }
        persons.groupBy { it.name.contains('i') }
    )

    // fold
    println(
//        list.fold(1, {f, s -> f * s})
        list.reduce { f, s -> s + f }
    )

    println(
        //listOfList.flatten()
        listOfList.flatMap { it.toList() }
    )

    // TODO [d, i, ...]
    println(
        listOfList.flatMap { it.toList() }.flatMap { it.toList() }
    )
}