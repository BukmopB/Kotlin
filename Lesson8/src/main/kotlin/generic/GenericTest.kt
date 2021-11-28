package generic

import java.io.IOException
import java.lang.Exception


val <T : Any> List<T>.getFirstAndLast : Pair<T, T> // Any?
    get() {
        return Pair(this[0], this[size -1])
    }

fun <T> List<T>.getByIndexes(vararg  args : Int) : List<T> {
    val res = mutableListOf<T>()
    args.forEach { res.add(this[it]) }
    return res
}
fun <T> List<T>.VgetByIndexes(vararg  args : Int) : List<T> {
    val result = mutableListOf<T>()
    for (i in args) {
        result.add(this[i])
    }
    return result
}



fun <T> copyWhenGreater (list: List<T>, threshold : T) : List<T>
where T: CharSequence, T: Comparable<T>
{
    return list.filter { it > threshold }
}

class Result<T>(val result: T? = null, val error: Throwable? = null)


fun getResult() : Result<Bitmap>
{
    val res =
    try {
        //
        Result<Bitmap>(result = Bitmap())
    }
    catch (e: Exception)
    {
        Result<Bitmap>(error = e)
    }

    return res
}

class Bitmap()

//fun <T> isA(any: Any) : Boolean = any is T
inline fun <reified T> isA(any: Any) : Boolean = any is T


fun main()
{

    println(
        isA<String>(21)
    )


    val goodResult = Result<Bitmap>(result = Bitmap())
    val errorResult = Result<Bitmap>(error =  IOException("network error"))



    println(
        copyWhenGreater(listOf("Dima", "Masha"), "Katya")
    )

    println(
        listOf(1,2,3,4,5,6).getByIndexes(1,2,0) // 2 3 1
    )
    println(
        listOf(1,2,3,4,5,6).VgetByIndexes(1,2,0) // 2 3 1
    )



    println(
        // listOf(1,2,3,4,null).getFirstAndLast
    )

    println(
        listOf(1,2,3,4).getFirstAndLast
    )
    println(
        listOf("abc", "abd", "efg").getFirstAndLast
    )


}