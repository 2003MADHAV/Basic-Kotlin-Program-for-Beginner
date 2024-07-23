fun main() {

    var car=Automobile("car","petrol")
    var car2=Automobile("car2","diseaal")
    var car3=Automobile("mkc","water")

    /*
    var person=Person("madhav",23)
    println(person.age)
    println(person.name)
    var person2=Person("keshav",25)
    println(person2.age)
    println(person2.name)

     */

}
class Automobile(val name: String,val tyers:Int,val maxseating :Int,val enginetype:String)
{
    init {
        println("$name is crated")
    }
    init {
        println("2nd Initiator block")
    }
    constructor(name: String,engine: String):this(name,4,5,engine)

   fun derive(){}
    fun applybreak(){}

}



/*
class empty{}
class person(nameparam:String,age:Int)
{
    val name:String=""
    var age:Int=0
    var canvote:Boolean=age>=18
}

 */