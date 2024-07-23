fun main() {
    /*
    val circle:Circle=Circle(4.0)
    val square:Square=Square(4.0)
    println(circle.area())
    println(square.area())

    val shapes= arrayOf(Circle(3.0),Square(4.0),Triangle(3.0,4.0))
    calculateArea(shapes)

     */
    val shape=Shape()
    println(shape)
    val square=Square(4.0)
    println(square)
}
fun printAre(shape: Shape){
    println(shape.area())
}
fun calculateArea(shapes: Array<Shape>){
    for (shape in shapes){
        println(shape.area())
    }
}
open class Shape{
    open fun area() :Double{
        return 0.0
    }

    open fun drag() {}
}

class Circle(val radius:Double): Shape(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}
class Square(val side:Double): Shape(){
    override fun area(): Double {
        return side*side
    }
}
class Triangle(val base:Double,val height:Double):Shape(){
    override fun area(): Double {
        return 0.5*base*height
    }
}