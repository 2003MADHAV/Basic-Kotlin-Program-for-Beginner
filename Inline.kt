fun main() {
    calculateTimeRun {
        loop(100000)
    }

}
fun calculateTimeRun(fn:()->Unit){
    val start=System.currentTimeMillis()
    fn()
    val end=System.currentTimeMillis()
    println("Time take ${end - start} ms")
}

fun loop(n:Long){
    for (i in 1..n){
        //
    }

}