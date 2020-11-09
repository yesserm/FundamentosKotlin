/**
Introducción a funciones en Kotlin
 */
fun main() {
    var resultado = suma(10, 8)
    val cosenoUno = Math.cos(1.0)

    print("resultado de la suma es $resultado y el uso del coseno $cosenoUno")
}

fun suma(a: Int, b: Int): Int {
    return a + b
}
