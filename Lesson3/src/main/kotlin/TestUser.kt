import java.math.BigInteger

open class User(val name: String, val age: Int) {

    val isMarried : Boolean
    constructor(name: String) : this(name, 33)

    init {
        isMarried = true
    }
}

class oldUser(name: String, age: Int, val account : String) : User(name, age)


class RationalNumber(n: Int = 1, d: Int = 1) {
    val numerator: BigInteger
    val denominator: BigInteger
//    constructor() : this(1, 1)
//    constructor(n: Int, d: Int) {
//        numerator = n.toBigInteger()
//        denominator = d.toBigInteger()
//    }

    init {
        var first: BigInteger = n.toBigInteger()
        var second: BigInteger = d.toBigInteger()
        var divider: BigInteger = first.gcd(second)

        while (divider != 1.toBigInteger()) {
            first /= divider
            second /= divider
            divider = first.gcd(second)
        }

        numerator = first
        denominator = second
    }
    override fun toString(): String = "$numerator / $denominator"

    operator fun plus(r: RationalNumber) : RationalNumber {
        return RationalNumber((this.numerator * r.denominator + this.denominator * r.numerator).toInt(),
            (this.denominator * r.denominator).toInt())
    }
}

operator fun RationalNumber.times(r: RationalNumber) : RationalNumber {
    return RationalNumber((this.numerator * r.numerator).toInt(), (this.denominator * r.denominator).toInt())
}

fun main() {
    val r = RationalNumber(3, 4)
    val a = RationalNumber(2, 5)
    println(r)
    println(RationalNumber())


    println(r + a)
    println(r * a)

//    RationalNumber(130, 30) -> RationalNumber(13, 3)

}