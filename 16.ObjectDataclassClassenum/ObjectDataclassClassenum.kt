//objeto nombrado
object Matematica {
    val PI = 3.1416
    fun aleatorio(minimo: Int, maximo: Int) = ((Math.random() * (maximo + 1 - minimo)) + minimo).toInt()
}
//enumeracion
enum class Sexo{
    MASCULINO,
    FEMENINO,
    OTRO
}
//clase para almacenar datos
data class Persona(var nombre: String, var edad: Int, var sexo: Sexo) {
    override fun toString(): String {
        return "$nombre, $edad, $sexo"
    }
}

fun main() {
    var persona1 = Persona("Juan", 22, Sexo.MASCULINO)
    var persona2 = Persona("Ana", 59, Sexo.FEMENINO)
    println(persona1)
    println(persona2)
    println("El valor de Pi es ${Matematica.PI}")
    print("Un valor aleatorio entre 5 y 10: ")
    println(Matematica.aleatorio(5, 10))
}