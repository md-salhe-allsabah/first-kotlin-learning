open class Person(val name: String, val age: Int) {
    init{
        println("initialized name is $name")
        println("initialized age is $age")
    }
}

class PersonWorks(name: String , age: Int , occupation: String) : Person(name , age)
{
    init{
        println("Initialized Occupations is $occupation")
    }
}