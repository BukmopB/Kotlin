import `object`.Outer

class KotlinOuter {
    // Вложенный класс
    class KotlinNested {

    }

    // Внутренний класс
    inner class KotlinInner {
        fun getOuter() : KotlinOuter = this@KotlinOuter
    }
}

fun main() {
    val outer = KotlinOuter()
    val nested = KotlinOuter.KotlinNested()
    val inner : KotlinOuter.KotlinInner = outer.KotlinInner()
}