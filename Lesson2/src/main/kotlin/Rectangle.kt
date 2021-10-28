class Rectangle (val height: Int, val width: Int){

//    fun isSquare() = height == width
    val isSquare : Boolean
//    get() = height == width
    get() {
        println("Calculating...")
        return height == width
    }

    var depth = 14
    set(value) {
        //
        field = value
    }
}