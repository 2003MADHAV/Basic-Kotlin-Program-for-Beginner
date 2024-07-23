fun main(){
    var arr= arrayOf("madhav","keshav","Rajan","shivam")
    var arr1= arrayOf(1,2,3,4)
    //define explisit areay
    var arr2= arrayOf<Int>(5,6,7,8)
    for (i in arr){
        println(i)
    }
    println(arr[0])
    println(arr.get(3))
    arr.set(0,"kumar")
    println(arr.get(0))
    //println(arr[5])   // Index 5 out of bounds for length 4
    println(arr1.get(3))
    arr2.set(3,40)
    println(arr2[3])
    println("size of array 1")
    println(arr1.size)
    println("size of array 2")
    println(arr.size)
    println("size of array 3")
    println(arr2.size)

}