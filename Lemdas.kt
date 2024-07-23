fun main() {
    /*
    var fn:(a:Int,b:Int) -> Int= ::sum
    val lambd1={x:Int,y:Int-> x+y}
    val multiLineLambda={
        println("welcome to lemdas concept")
        val a:Int=3+5
        "Heloo ,your welcome"
        2
    }

    val singleParamLambda={x:Int->x*x}
    val lambda2:(Int)->Int={x->x*x}

    val sayhi={msg:String-> println("Hello $msg") }
    val sayhi2={msg:String-> println("Hello $msg") }

    println(multiLineLambda())

     */
    //single paramerter concept lemdas
    /*val singleParam:(Int)->Int={x->x+x}
    val simplifySingleParam:(Int)->Int={it +it}*/

    val x=calculator(1,2,{a,b-> a+b })
    println(x)

}

fun sum(a:Int, b:Int):Int= a+b
fun calculator(a:Int,b:Int,op:(Int,Int)->Int):Int{
   return op(a,b)
}