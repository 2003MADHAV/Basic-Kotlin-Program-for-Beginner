fun main() {
    /*
    var count=5
    while (count>=1){
        println("Jai sri Ram")
        count--
    }

     */
// printing table of 2
    /*
    var num=2
    var index=1
    while (num<=10){
        println(num * index)
        num++
    }
    println("outer loop:"+num)

     */
    /*
    var index=6
    do {
        println("madhav kumar")

    }
    while (index <= 5)

     */
    //range function working using ..
    //for (i in 1..5)
    /*

    for (i in 1..5 step 2)
        println(i)

    println("until")

    for ( i in 1 until 5)
        println(i)

    println("Down to")
    for (i in 10 downTo 1)
        println(i)

    //using step in down to
    println("Down to")
    for (i in 10 downTo 1 step 3)
        println(i)

     */

    val number=2
    for (i in 1..10){
        println(number.toString()+"*"+i+"="+(number*i))
        println("$number * $i=${number*i}")
    }

}