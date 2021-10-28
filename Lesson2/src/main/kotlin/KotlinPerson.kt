class KotlinPerson (var firstName: String, var lastName: String, var age: Int = 27){
    constructor(lastName: String) : this("Dima", lastName)
}