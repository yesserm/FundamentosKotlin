/*Ciclos for in */
fun main() {
    var arregloInt = intArrayOf(4,5,6,7,8,9,10,11,12,13,14,15,16,17,18)
 
    //sacando solo los valores con items
    for( i in arregloInt) { 
        println("valor $i")     
    }

    //sacando el indice y los valores
    for( (indice,valor)  in arregloInt.withIndex()) { 
        println("El indice $indice representa el valor de: $valor")     
    }  
}