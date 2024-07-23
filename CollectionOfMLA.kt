fun main() {
    //imputable list
//    val nums= mutableListOf(1,2,3)
//    println(nums.indexOf(3))
//    println(nums.contains(4))
//    nums[1]=2
//    nums.add(5)
//    nums.remove(1)
//    println(nums)
//
//    val list2= listOf(11,12)
//    nums.addAll(list2)
  //    println(nums)
    val student = mutableMapOf<Int,String>()
    student.put(1,"madhav")
    student.put(2,"kumar")
    student.put(3,"choudhary")
    student.put(4,"jaihind")

    println(student.get(1))
    println(student.get(11))

    for ((key,value )in student){
        println("$key =$value")
    }
    student[8]="Rama"
    println(student[8])

    val map= mapOf<Int,String>(1 to "Heloo",2 to "World")
   println(map)
}