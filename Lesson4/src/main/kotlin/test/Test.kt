package test
fun String?.isEmptyOrNull() : Boolean = this?.isEmpty() ?: true


// 34 sm 13 = 47
// 34.sm(13)

infix fun Int.sm(other: Int) : Int = this + other

data class RationalNumber(val numerator: Int, val denominator : Int)

fun Int.r()           : RationalNumber = RationalNumber(this, 1)
fun Pair<Int,Int>.r() : RationalNumber = RationalNumber(first, second)


/*
    plus
    minus
    times
    div
*/



open class Base
class Child : Base()

fun Base.hello() : String = "hello base"
fun Child.hello() : String = "hello child"

operator fun RationalNumber.plus(r: RationalNumber) : RationalNumber  {
    return RationalNumber(
        (numerator*r.denominator + r.numerator*denominator), (r.denominator*denominator)
    )
}
operator fun RationalNumber.times(r: RationalNumber) : RationalNumber  {
    return RationalNumber(
        (numerator* r.numerator), (r.denominator*denominator)
    )
}

operator fun RationalNumber.unaryMinus() : RationalNumber = RationalNumber(-numerator, -denominator)


fun main()
{
    val r1 = RationalNumber(1,2)
    val r2 = RationalNumber(3, 4)
    println(r1 + r2)
    println(r1 * r2)
/*    val child : Base = Child()
    println(child.hello())*/

/*
    println(12.sm(22))
    println(12 sm 22)
*/

/*
    println(34.r())
    println((25 to 45).r())*/
/*
    println("".isEmptyOrNull())      // true
    println(null.isEmptyOrNull())    // true
    println("hello".isEmptyOrNull()) // false
*/
}

