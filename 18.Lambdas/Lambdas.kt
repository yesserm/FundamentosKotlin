data class Person(val name: String, val age: Int)
fun main() {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))

    val personas = listOf(Person("Alice", 29), Person("Bob", 31))
    val nombres = personas.joinToString(separator = " ",transform = { p: Person -> p.name })
    println(nombres)
}