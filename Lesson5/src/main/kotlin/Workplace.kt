package functional

//import functional.done.Emp

data class Emp(
    val name: String,
    val age : Int,
    val position: String
    )

fun main()
{
    val employees = listOf(
        Emp("Max Petrov", 22, "programmer"),
        Emp("Ivan Shapovalov", 33, "analyst"),
        Emp("Semen Deznev", 55, "manager"),
        Emp("Oleg Petrov", 19, "intern"),
        Emp("Katerina Drogova", 31, "programmer"),
        Emp("Nikolay Spivakov", 23, "analyst"),
        Emp("Boris Moiseev", 48, "manager"),
        Emp("Petr Sveshnikov", 37, "programmer"),
        Emp("Maria Kasatonova", 33, "analyst"),
        Emp("Olga Filimonova", 27, "programmer")
    )

    // самый молодой
    println(employees.minBy { it.age })

    // количество программистов
    println(
//        employees.count { it.position == "programmer"}
        employees.filter { it.position == "programmer" }.count()
    )

    // распечатать все имена программистов
//    employees.forEach { println(it.name) }
    println(employees.filter { it.position == "programmer" }.map { it.name } )

    // средний возраст
    println(employees.map { it.age }.average())

    // разделить на две группы - старше 40 и младше
        // найти профессию самого "старого" из "молодых"
        // стедний возраст "старых" и  "молодых"
    println(employees.groupBy { it.age < 40 }.filter { it.key })
    println(employees.groupBy { it.age < 40 }.filter { !it.key })

//    println(employees.groupBy { it.age < 40 }.filter { it.key }.flatMap { it.value }.maxBy { it.age }?.position)
//    println(employees.groupBy { it.age < 40 }.filterKeys { it }.map { it.value }.flatten().maxBy { it.age }?.position)
    println(employees.groupBy { it.age < 40 }.filterKeys { it }.flatMap { it.value }.maxBy { it.age }?.position)
    println(employees.groupBy { it.age < 40 }.filter { it.key }.flatMap { it.value }.map { it.age }.average())
    println(employees.groupBy { it.age < 40 }.filter { !it.key }.flatMap { it.value }.map { it.age }.average())
    println(employees.groupBy { it.age < 40 }.mapValues { it.value.map { it.age }.average()})

    // сгруппировать по проффесии и узнать кол-во раотников в каждой професси
    employees.groupBy { it.position }.forEach { (t, u) -> println(t + " " + u.count())}
    println(employees.groupBy { it.position }.mapValues { it.value.size })

    // распечатать работников с самым часто встречающимся возрастом
    println(employees.groupBy { it.age }.maxBy { it.value.count() }?.value)
    println(employees.groupBy { it.age }.maxBy { it.value.size })


    // найти пару сотрудников с максимальной разницей в возрасте
    // в одну цепочку
    println(
        employees.flatMap { emp -> employees
            .map { it -> Pair(it, emp) } }
            .maxBy { it.first.age - it.second.age }
    )

}