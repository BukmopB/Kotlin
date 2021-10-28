// Это однострочный коментарий

/*
    Это многострочный коментарий
    /* Это вложенный коментарий */
 */

const val DEBUG = true

fun main() {
    val name : String = "Dima"
    //name = "Dima"

    var lastname = "Ivanov"
    lastname = "Petrov"

    println("Hello, world!")

    // nullable типы
    var age : String?
//    age = null
    age = "14"

//    println(" age length: " + age?.length)
    println(" age length: " + age!!.length)

    // ветвление
    val temperature = 14

    val condition = if (temperature < 5)
        "Cold"
    else if (temperature < 15)
        "Medium"
    else if (temperature < 40)
        "Hot"
    else
        "Very hot"

    println(condition)

    // ветвление с помощью when
    val cond = when {
        temperature < 5 -> "Cold"
        temperature < 15 -> "Medium"
        temperature < 40 -> "Hot"
        else -> "Very hot"
    }

    // проверка и приведение типов
    val obj : Any = "22"
    // smart cast
    if (obj is String) {
        println("    " + obj.length)
    }

    // операторы приведения
    val y = 12

    // небезопасное/unsafe
//    val x: String = y as String

    // безопасное/safe
    val z: String? = y as? String

    println("z = " + z)


    // строковые шаблоны
    val firstname = "Vic"
    val lastname2 = "Bas"

    println("Hello $firstname $lastname2, how are you")

    val literal = """
        First string
        Second string
        Third string
    """.trimIndent()

    val literal2 = """
        | First string
        | Second string
        | Third string
    """.trimMargin()

    println("""
        &1 First string
        &1 Second string
        &1 Third string
    """.trimMargin("&1 "))

    println(literal)
    println(literal2)

    println(greeting("An", "2"))
    println(japaneseSalary(5_000, 5))


    // циклы
    // while
    // do-while
    var a = 1
    while (a < 11) {
        println(a++)
    }

    a = 1
    do {
        println(a++)
    } while (a < 11)

    // диапазон
    val oneToFive = 1 .. 5
    val smallLetters = 'a' .. 'z'

    if ('d' in smallLetters)
        println("входит")
    else
        println("не входит")

    val hundredToOne = 100 downTo 1 step 4

    for (k in hundredToOne) {
        println("k = $k")
    }

    val betweenJavaToYaml = "Java" .. "Yaml"
    if ("Kilo" in betweenJavaToYaml) {
        println("Kilo")
    }

    // fizz buzz
    val oneToFifteen = 1 .. 15
    for (n in oneToFifteen) {
        println("$n -- ${fizzBuzz(n)}")
    }
}

//fun greeting(firstName: String, lastName: String) : String {
//    return "Hello, $firstName $lastName"
//}

//fun greeting(firstName: String, lastName: String) : String = "Hello, $firstName $lastName"

fun greeting(firstName: String, lastName: String) = "Hello, $firstName $lastName!"

fun japaneseSalary(base: Int, years: Int) : Int = base + years * 10_000

fun printAny(any: Any) = when (any) {
        is Int -> "Int $any"
        is String -> "String $any"
        else -> "Any $any"
}

fun fizzBuzz(int: Int) = when {
    (int % 15) == 0 -> "fizzbuzz"
    (int % 3) == 0 -> "fizz"
    (int % 5) == 0 -> "buzz"
    else -> ""
}