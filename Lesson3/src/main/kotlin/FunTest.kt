fun main() {
    println("hello")

    val intList = listOf(1, 5, 10, 22, 3)

    println(intList.mySum())
    println(intList.lastElem())
    println("string".reverse())
    println("string".isPalindrome("123"))
    println("string".isPalindrome("gnirts"))

    // 3 sum 5 -> 8
    println(3 sum 5) // DSL
}

infix fun Int.sum(other: Int) : Int = this + other

fun List<Int>.mySum() : Int {
    var sum = 0
    for (num in this) {
        sum += num
    }
    return sum
}

fun List<Int>.lastElem() : Int = this[size - 1]

fun String.reverse() : String {
    var result = StringBuilder("")
    for (i in this.length - 1 downTo 0) {
        result.append(this[i])
    }
    return result.toString()
}

fun String.isPalindrome(s: String) : Boolean = this == s.reverse()
