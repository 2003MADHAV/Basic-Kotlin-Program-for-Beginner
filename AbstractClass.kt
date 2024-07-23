fun main() {
    println("hi")
    val circle=Circle1(4.0)
    println(circle.area())
    circle.display()
}
class A{
    fun mathod1(){
        println("i am method")
    }
}
abstract class Shape1{
     var name:String=""
     abstract fun area():Double
     abstract fun display()
 }

class Circle1(val radius:Double):Shape(){
    override fun area(): Double=Math.PI * radius*radius
     fun display() {
        println("Circle is getting display")
    }
}