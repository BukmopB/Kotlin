// public
// protected
// private
//
// internal

open class Animal {
    open fun voice() = println("Voice!")
}

class Cow : Animal() {
    override fun voice() = println("Muuu")

}

fun Animal.jump()  {
    println(this::class.java)
    println("Animal jump")
}

fun Cow.jump() = println("Cow jump")

interface Clickable {
    fun click()
    fun whoAmI() = println("I'm a clickable")
}

interface Focusable {
    fun setFocus(focus: Boolean) = println("Focusable")
    fun whoAmI() = println("I'm a focusable")
}

class ImageButton : Button() {
//    override fun click() {
//        super.click()
//    }
}

open class Button : Clickable, Focusable {
    final override fun click() {
        println("Clicked!")
    }

    override fun whoAmI() {
        super<Clickable>.whoAmI()
        super<Focusable>.whoAmI()
    }
}

abstract class AbstractButton : Clickable {
    val depth = 12
    abstract fun depth()
}

fun main() {
    val animal = Animal()
    animal.voice()

    val cow : Animal = Cow()
    println(cow is Cow)
    cow.voice()

    animal.jump()
    cow.jump()

    Cow().jump()

    val button: Clickable = Button()
    button.click()
    button.whoAmI()
}