import java.lang.classfile.instruction.IncrementInstruction

fun main() {
/*
    //println(K.num)
    //B.test()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.IncrementFBLikes()
    SharingWidget.display()
    SharingWidget.IncrementFBLikes()
    SharingWidget.IncrementFBLikes()
    SharingWidget.display()

 */
/*
    var testobj=object {
        val x:Int=10
        fun method(){
            println("I am object ")
        }
    }
    println(testobj.method())

 */
/*
    var obj=object :Clonable{
        override fun clone() {
            println("I am clone")
        }

    }
    obj.clone()

 */
    var obj2= object : Person2("Madhav kumar") {
        override fun fullName(){
            super.fullName()
            println("Anonymous -$name")

        }

    }
    obj2.fullName()

}

/*
object K{
    val num:Int= 10
}
object B{
    val p:Int=20
    fun test(){
        println("This is object B")
    }
}

 */
/*
object SharingWidget{
   private var twitterLikes=0
   private var fblike=0

     fun incrementTwitterLikes()= twitterLikes++
    fun IncrementFBLikes()= fblike++
    fun display()= println("Facebook-$fblike -- Twiter - $twitterLikes")

}

 */
interface Clonable{
    fun clone()
}
open class Person2(val name:String){
    open fun fullName()= println("Full Name -$name")
}