fun main() {
    println("Hello")

    println("123".toInt())
    println(3.14f.toBigDecimal())

    println(greet("Dima", "Petrov", 33))
    println(greet(age = 33, last = "Petrov", first = "Dima"))
    println(greet("Dima", age = 33, last = "Petrov"))
    println(greet("Sveta", last = "Ivanova"))

    val pair = "Vic" to "Bas"
    println(greet(pair.first, pair.second))
    println(greet(pair))

    val nameMap = mapOf("Dima" to "Petrov", "Katya" to "Golubeva", "Sergey" to "Orlov")
    greet(nameMap)

    nameMap.forEach { println(greet(it.key, it.value)) }
    nameMap.forEach { elem -> println(greet(elem.key, elem.value)) }
    //println(greet("", ""))

    println(formatList(listOf("Dima", "Max", "Sveta")))


    //RegExp

}

fun greet(pair: Pair<String, String>) : String {
    return "first ${pair.first} last ${pair.second}"
}

fun greet(map: Map<String, String>) {
    for ((key, value) in map) {
        println("first $key last $value" )
    }
}

fun greet(first: String, last: String, age: Int = 14) : String {
    require(first.isNotBlank()) {"Нужно указать имя"} // IllegalArgumentException
    return "$first $last $age"
    // require requireNotNull -> IllegalArgumentException
    // check checkNotNull -> IllegalStateException
    // assert -> AssertionError

}

fun formatList(list: List<String>, prefix: String = "[", suffix: String = "]", delim: String = ", ") : String {
    val result = StringBuilder(prefix)
    for ((index, name) in list.withIndex()) {
        if (index != 0) {
            result.append(delim)
        }
        result.append(name)
    }
    result.append(suffix)
    return result.toString()
}