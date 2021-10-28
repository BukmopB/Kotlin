package operators

import javax.print.attribute.standard.MediaSize

data class Point(val x: Int, val y: Int)
{
    operator fun plus(other: Point) : Point
    {
        return Point(x + other.x, y + other.y)
    }
}

class Rect(val ul : Point, val lr : Point)

operator fun Rect.contains(p: Point) : Boolean
{
    return p.x in ul.x .. lr.x && p.y in ul.y .. lr.y
}

// Hedgehog whoAmI
// Snake    whoAmI
// BarbWire whoAmI

class Hedgehog {
    fun whoAmI() = println("i'm a Hedgehog")
}

class Snake {
    fun whoAmI() = println("i'm a Snake")
}

class BarbWire {
    fun whoAmI() = println("i'm a BarbWire")
}

operator fun Hedgehog.plus(s:Snake) : BarbWire = BarbWire()

val lazyValue : String by lazy {
    println("Инициализация")
    "Hello"
}

class LateInit {
    var name : String = "Misha"
    lateinit var late : String

    fun init() {
        println(this::late.isInitialized)
        late = "Initialized"
        println(this::late.isInitialized)
    }
}

fun main()
{
    var lateInit = LateInit()
    // lateInit.late // UninitializedPropertyAccessException
    lateInit.init()
    println(lateInit.late)

/*
    println(lazyValue)
    println(lazyValue)

        println("hello")
*/

/*
    val hedgehog = Hedgehog()
    val snake = Snake()

    (hedgehog + snake).whoAmI()
*/


/*
    val point1 = Point(3,3)

    val point2 = Point(5,5)

    println(point1 + point2)

    val rect = Rect(Point(4,4), Point(20, 10))

    println(point1 in rect)
    println(point2 in rect)
*/

}


