package functional

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    var counter = 0
    list.forEach { counter++ }
    println(counter)


    println(processor(1, 2, ::sum))

    val multiply /*: (Int, Int) -> Int*/ = {first: Int, second: Int -> first * second}

    println(multiply.invoke(10, 2))

    println(processor(1, 2, multiply))

    val print:() -> Unit = { println("hello")}

    run(print)

    run({ println("hello 2") })
    run { println("hello 3") }
    run() { println("hello 3") }

}

fun sum(a: Int, b: Int) = a + b

fun processor(a: Int, b: Int, f: (Int, Int) -> Int     ) : Int {
    return f(a, b)
}