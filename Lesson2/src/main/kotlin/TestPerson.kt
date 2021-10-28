fun main () {

    val misha = KotlinPerson("Misha", "Golubev", 27)

    println(misha.age)

    val ivanov = KotlinPerson("Ivanov")
    println(ivanov.firstName)

    val rect = Rectangle(12, 42)
//    println(rect.isSquare())
    println(rect.isSquare)

    rect.depth = 25

    println(rect.depth)

    val orange = Color.ORANGE

    println(orange.rgb())

    println(Cru.PREMIER)

    println(Cru.valueOf("PREMIER"))

    // "dima".lastChar() -> 'a'  // Функции расширения

    println("dima".lastChar())

    println(14.isEven())
    println(1.isEven())

    println(14.isOdd)
    println(1.isOdd)
}

//fun String.lastChar() : Char {
//    return this.get(this.length - 1)
//}
fun String.lastChar() = get(length - 1)

// 14.isEven() -> true
// 1.isEven() -> false
fun Int.isEven() = this % 2 == 0


// 3.isOdd
//val Int.isOdd : Boolean
//get() {
//    return this % 2 == 1
//}
val Int.isOdd get() = this % 2 == 1