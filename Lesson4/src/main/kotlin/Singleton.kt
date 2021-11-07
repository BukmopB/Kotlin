object Singleton {
    var name: String = "Dima"
    fun hello() = println("hello")
    // constructor()
    init {

    }
}

fun main() {
    println(Singleton.name)
    Singleton.hello()
}