class Frutas(color:String,sabor:String,precio:Int){    
    var color:String = ""
    var sabor:String = ""
    var precio:Int = 0
    
    init{
       this.color = color
       this.sabor = sabor
       this.precio = precio
    }
    
    fun podrirse(){  
      print("La fruta se esta pudriendo o podriendo")      
    }    
}

fun main() {
   var manzana = Frutas("Rojo","Dulce",4)
   println(manzana.color) 
   manzana.podrirse()      
}