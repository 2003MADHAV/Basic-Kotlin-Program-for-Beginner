fun main() {
    var i: Int=23
    println(i.toFloat())
    println(i.plus(5))

    val p1=Person("madhav",23)
    val p2=Person("harshita",3)

    println(p1.elgibleforvote())
    println(p2.elgibleforvote())

    p2.age=22
    println(p2.elgibleforvote())
}
class Person(val name:String,var age:Int){  //properties
    fun elgibleforvote(): Boolean{
        return age>=18
    }
}