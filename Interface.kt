fun main() {
    dargObject(arrayOf(Circle(4.0),Square(4.0),Triangle2(3.0,4.0),Player("mukesh")))

}

fun dargObject(arrayOf: Array<Any>) {
    TODO("Not yet implemented")
}


fun dargObj(objects:Array<Draggable>){
    for (obj in objects){
        obj.drag()
    }
}
interface Draggable{
    fun drag()
}
/*
interface Cloneable{
    fun clone()
}

 */
abstract class Shape2 : Draggable{
    abstract fun area():Double


}
class Circle2(val radius:Double): Shape(){
    override fun area(): Double =Math.PI*radius*radius
    override fun drag()= println("circle is draing")

}
class Square2(val side:Double):Shape(){
    override fun area(): Double=side*side
    override fun drag()= println("square is draing")
}
class Triangle2(val base:Double,val height:Double):Shape(){
    override fun area(): Double =0.5*base*height
    override fun drag()= println("tiangle is draing")

}
class Player(val name:String):Draggable{
    override fun drag()= println("$name is dragging")
}