package collections

val list = listOf(1,2,3,45)

val mutableList = mutableListOf(1,2,3,4)

fun main()
{
    // list[10] = 23
    println(list[2])
    mutableList[2] = 33

    var list1 : List<Int?>   = listOf(1, 5, null, 2, null)

    var list2 : List<Int?> ? = listOf(1, 5, null, 2, null)
    list2 = null

    val triple = Triple(1, "abc",  listOf<String>())

    val (one, _, three)  = triple

    Pair(Pair(1,2), Pair("abc", "cbd"))

    val map = mapOf<Int, Int>(1 to 2)

    println(map.javaClass.canonicalName)


}