import javax.sound.sampled.AudioFileFormat.Type

fun main() {
    var pizaa1:Pizaa=Pizaa.Factory.create("Peppy Paneer")
    println(pizaa1)


    //here i am calling via factory refernce -don't want to use Factory ref
    //now after dfing that as comapnion
    var pizaa2:Pizaa=Pizaa.create("Tomato")
    println(pizaa2)

    //one more things  we can do -we want everyone to call this crate method if they want Pizza
    //for that we  will mark the constructor as private

    // var pizaa3=Pizaa("tomato","panner")  //now everyone need to call create Method
    // i.e Everyone has to call its factory

}
//Example of factory pattern using companion

class Pizaa private constructor(val type:String,val topping:String){
     companion object Factory{
        fun create(pizaaType: String):Pizaa{
            return when(pizaaType){
                "Tomato" -> Pizaa("Tomato","Tmomato , cheese")
                "Peppy Panner"->Pizaa("Panner Farm","Panner , cheese Burst ,Tomato,Onion")
                else -> Pizaa("Basic","Onion ,Cheese")
            }
        }
    }

    override fun toString(): String {
        return "Pizza(type='$type',toppings='$topping')"
    }
}