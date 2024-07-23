fun main() {
    val circle=Circle5(4.0)
    val player=Player5("mukesh")

    val arr= arrayOf(circle,player)
    for (obj in arr){
        if (obj is Circle5){
            println(obj.area())
        }
        else{
            (obj as Player5).sayMyName()
        }
    }

/*
    if (circle is Circle5){
        println("This is Circle")
    }

 */
}
interface Draggable1{
    fun drag()
}
abstract class Shape5:Draggable1{
    abstract fun area():Double
}
class Circle5(val radius:Double): Shape5() {
    override fun area(): Double =Math.PI*radius*radius
    override fun drag() = println("Circle is dragging")
}
class Player5(val name:String):Draggable1{
    override fun drag() = println("$name is dragging")
    fun sayMyName()= println("hey my name is -$name")
}
class Test{

}