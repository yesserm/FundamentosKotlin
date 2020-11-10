class Frutas(){
    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    var numHojas:Int = 0

    constructor(color:String,sabor:String,precio:Int):this(){
       this.color = color
       this.sabor = sabor
       this.precio = precio
    }
    
    constructor(color:String,sabor:String,precio:Int,numHojas:Int):this(){
       this.color = color
       this.sabor = sabor
       this.precio = precio
        this.numHojas = numHojas
    }
    
    fun pudrirse(){  
      print("La fruta se esta pudriendo")     
    }    
}

fun main() {
   var manzana = Frutas("Rojo","Dulce",4)
   var manzanaConHojas = Frutas("Verde","Agria",5,2) 
    
   println(manzanaConHojas.numHojas) 
   println(manzana.precio) 
}