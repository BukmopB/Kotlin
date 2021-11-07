class Point (val x : Int, val y : Int)

class Rect(val sw: Point, val ne: Point)

fun main() {
    println(
        Point(5, 5) in Rect(Point(1, 1), Point(10, 10))
    ) // true

    println(
        Point(50, 5) in Rect(Point(1, 1), Point(10, 10))
    ) // false

    println(
        Point(5, 5) inside Rect(Point(1, 1), Point(10, 10))
    ) // true
}

// Rect.contains
operator fun Rect.contains(point: Point) : Boolean {
//    return this.sw.x < point.x && this.ne.x > point.x && this.sw.y < point.y && this.ne.y > point.y
//    return point.x in this.sw.x .. this.ne.x && point.y in this.sw.y .. this.ne.y
    return point.x in sw.x .. ne.x && point.y in sw.y .. ne.y
}

infix fun Point.inside(rect: Rect) : Boolean = this in rect