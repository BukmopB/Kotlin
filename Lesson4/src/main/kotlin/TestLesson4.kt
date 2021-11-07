fun main()  {
    println("123". isNullOrEmptyV())
    println("". isNullOrEmptyV())
    println(null. isNullOrEmptyV())
    println("        ". isNullOrEmptyV())
    println("    .    ". isNullOrEmptyV())

    // Elvis operator

    val name : String? = null
    println(len(name))
    println(len("name"))
}

//fun len(s: String ? ) : Int {
//    return s?.length ?: 0
//}
fun len(s: String ? ) = s?.length ?: 0


//fun String?.isNullOrEmptyV() : Boolean {
//    if (this == "" || this == null) {
//        return true
//    }
//    return false
//}
fun String?.isNullOrEmptyV() : Boolean = this == null || this.isBlank()