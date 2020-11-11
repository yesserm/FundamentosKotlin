fun main() {
    val par = Par(1, "uno")
    val par2 = Par(2,"dos")

    val (num, nombre) = par
    val (num2, nombre2) = par2

    println("numero = $num, nombre = $nombre")
    println("numero = $num2, nombre = $nombre2")
}

class Par<K, V>(val primero: K, val segundo: V) {
    operator fun component1(): K {
        return primero
    }

    operator fun component2(): V {
        return segundo
    }
}