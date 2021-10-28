package `object`

// object

object Singleton
{
    var name : String = "Dima"
    fun hello() = println("hello")
}

class Outer {
    private constructor()
    companion object Loader {
        fun hello() {
            println("hello from companion object")
        }
        fun get() : Outer = Outer()
    }
}

interface ClickListener {
    fun click()
}

class View {
    fun setOnClickListener(listener: ClickListener)
    {
        //
    }
}

fun  main()
{

    val listener: ClickListener = object : ClickListener{
        override fun click() {
            TODO("not implemented")
        }
    }

    val view = View()

    view.setOnClickListener(listener)

    view.setOnClickListener(object : ClickListener {
        override fun click() {
            TODO("not implemented")
        }
    })



/*
    // val outer = Outer() // private constructor
    val outer = Outer.get()
    Outer.Loader.hello()
*/

/*
    println(   Singleton.name )
    Singleton.hello()
*/
}