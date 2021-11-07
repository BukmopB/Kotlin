sealed class Expr

class Num(val value: Int) : Expr()

class Sum(val left: Expr, val right: Expr) : Expr()

fun main() {
    val n5 = Num(5)
    val n7 = Num(7)

    val s = Sum(n5, n7)

    println(eval(s))
}

fun eval(e: Expr) : Int {
    return when(e) {
        is Num -> e.value
        is Sum -> eval(e.left) + eval(e.right)
    }
}