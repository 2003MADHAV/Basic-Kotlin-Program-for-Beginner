fun main() {

    val p1=Person3(1,"madhav")
    val p2=Person3(1,"madhav")

    val p3:Person3=p1.copy(id=3)
    println(p3)

    val(id:Int,name:String)=p1
    println(id)
    println(name)
    println(p1.component1())

    /*
       println(p1)
       println(p2)
       println(p1.hashCode())
       println(p1==p2)

     */
}
data class Person3(val id:Int,val name:String)
{

}