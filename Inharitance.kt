fun main() {
    val objchild=child()


}
open class Parent
{
    init {
        println("perent constructor is called")
    }
    val name:String=""
    fun mymethod(){
        println("I am In parent")
    }
}
class child:Parent()
{
    init {
        println("child constructor is called")
    }

 val name2:String=""
 fun mymethod2(){
     println("I am in child")
 }
}