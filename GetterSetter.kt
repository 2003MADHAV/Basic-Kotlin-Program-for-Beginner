import java.util.*

fun main() {

    //getter and settter

    val p1=Person("madhav",23)
    println(p1.age)
    p1.age=-23
    p1.age=-17
    println(p1.name)



    /*
    val obj=Calculator()
    print("Addition :")
    println(obj.add(89,65))
    print("Subtraction:")
    println(obj.sub(89,65))
    print("Multiplication:")
    println(obj.multiplication(89,65))
    print("Division:")
    println(obj.div(89,65))
    print("Modulus:")
    println(obj.modulus(89.0,65.0))

}

class Calculator{
    // lateinit var message: String
    fun add(a:Int, b:Int) :Int
    {
        return a+b
    }
    fun multiplication(a:Int, b:Int) :Int
    {
        return a*b
    }
    fun sub(a:Int, b:Int) :Int
    {
        return a-b
    }
    fun div(a:Int, b:Int) :Int
    {
        return a/b
    }
    fun modulus(a:Double, b:Double) :Double
    {
        return a%b
    }

     */


}
class person(name:String,age:Int){
    var name:String=name
        get() {
            println("name getter is called")
            return field.uppercase(Locale.getDefault())
        }
    var age:Int=age
        set(value){
            if (value>0){
                field=value
            }
            else{
                println("Age cant't be negative")
            }
        }
}