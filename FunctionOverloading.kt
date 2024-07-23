import kotlin.math.pow

fun main() {
    /*
    var result= addition(3,2)
    println(result)
    var result1 =addition(3.0,2.0)
    println(result1)

     */
    // println(addition(3,2))

//    println(addition(3.0,2.0))

    //
    var fn=::addition
   println(fn(1.0,2.0))


     fn=::power
    println(fn(2.0,3.0))

}

// method of function overloading
/*
fun addition(num1:Int,num2:Int) :Int
{
    return num1+num2
}
fun  addition(num1: Double,num2: Double):Double
{
    return num1+num2
}

 */
fun  addition(a: Double,b: Double):Double
{
    return a+b
}
fun power(a: Double,b: Double): Double {
    return a.pow(b)
}
