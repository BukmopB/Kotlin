class MyData {
    val data = mutableListOf<String>()
    fun String.addTo(): Unit {
        data.add(this)
    }
    operator fun String.unaryPlus() : Unit {
        data.add(this)
    }
}

fun main() {
    val myData = MyData()
        .apply {
            "dima".addTo()
            +"masha" // unaryPlus
        }

    println(
        myData.data
    )


    val builder = StringBuilder()

//    builder.append("123")
//    builder.append("456")

//    with(builder, { append("123");  builder.append("456")    })
//    with(builder, { append("123");  append("456")    })
//    with(builder) {
//        append("123")
//        append("456")
//    }

    val result =
        with(builder)
        {
            append("123")
            append("456")
            "ok"
        }
//    println(builder.toString())
//    println(result)
    println("with: ${builder.toString()}")
    println("with result: ${result}")


    val list = mutableListOf<String>()
    // TODO добавить в list 3 элемента с помощью apply
    // TODO dima, petya, katya
    // TODO public inline fun <T> T.apply( block: T.() -> Unit) : T

//    list.apply { this.add("dima") }

    println(
        list.apply {
            add("dima")
            add("petya")
            add("katya")
        }
    )

    // TODO let

    val name: String? = "max" /*null*/

//    if(name != null)
//    {
//
//    }

    name?.let {
        println("let: ${it.length}")
    }

    val b = StringBuilder()

    b.myrun {
        append(1)
        append("hello")
        append("roma")
    }

    println("myrun: ${b.toString()}")


    val lambda = { println("hello") }
    run(lambda)


    // TODO
    // public inline fun <T> T.also(  block: (T) -> Unit ) : T

//    val alsoBlock: (StringBuilder) -> Unit = {
//        it.append("Serafima")
//    }
//    b.also(alsoBlock)

    val alsoBlock: (StringBuilder) -> Unit = { it.append("Серафим") }

    b.also(alsoBlock)

    println(b)


}


public inline fun <T, R> T.myrun(block: T.() -> R): R {
//    return this.block()
    return block()
}