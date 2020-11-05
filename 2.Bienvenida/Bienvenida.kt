data class Person(val name:String, 
                val age:Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice"),
                         Person("Bob", age = 29),
                         Person("Yesser", age = 23),
                         Person("Maria", age = 52))

    val oldest = persons.maxBy{ it.age ?: 0 }
    println("The oldest is: $oldest")
}

// The oldest is: Person(name=Maria, age=52)