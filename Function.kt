

fun main() {
    /*
     result=add(7,2)
    println(result)
    EnvenorOdd(22)
    EnvenorOdd(24)

     */
    printmessage(3)
    printmessage(2)



}
/*
fun add(num1 :Int,num2 : Int) :Int
{
    val sum=num1+num2
    return sum
}

 */
//inline function
/*
fun add(num1 :Int,num2 : Int) =num1+num2

fun EnvenorOdd(num1 :Int)
{
    val result= if (num1%2==0)  "Even" else "odd"
    println(result)
}

 */
fun printmessage(count: Int=2){
    // we can not reassgin this count
    //count=3
    for (i in 1..count)
        println("Heloo  $i")
}