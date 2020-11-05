/*Tipos de Datos: Strings con secuencia de escape y Strings Puros (raw strings)
    
*/
fun main(args: Array<String>) {
 
    var cadena1:String = "Yesser"
    var cadena2:String = " Miranda"
    var dinero:Int = 10
    
    //string con secuencia de escape
    println("Mi nombre es: $cadena1 \ny tengo\t ${'$'}$dinero dolares")

    //string puro
    val hola = """Hola esto es 
    un ejemplo de cadena pura
    con varias lineas"""

    println("$hola su tam es ${hola.length} agregare este numero " + 2)
  
}