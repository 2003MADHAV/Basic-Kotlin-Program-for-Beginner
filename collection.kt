fun main() {
    val nums = listOf(1, 2, 3, 4, 5)
//    println(isOdd(3))
//    println(isOdd(2))


//    val list=nums.filter(::isOdd)
//    println(list)

    //this using function
    /*val list=nums.filter(fun(a:Int):Boolean{
        return a%2 !=0
    })
    println(list)*/

    // inplace of function we use lambda also
    /*  val list=nums.filter { a: Int -> a % 2 != 0 }
    println(list)

*/
    // here we use it also
    // optimization code

    /*val list=nums.filter { it % 2 != 0 }

    val userlist= listOf(User(1,"A"),
        User(2,"B"),
        User(3,"C"),
        User(4,"D")
    )*/

   /* val userdtl=userlist.filter { it.id==2 }
    println(userdtl)*/

    //map function
  /*  val list1=nums.map { it * it }

    val paidUserList=userlist.map {
        PaidUser(it.id,it.name,"Paid")
    }

    println(paidUserList)

*/

   /* for (i in nums){
        println(i)
    }*/

   nums.forEach{ println(it) }

}



/*
fun isOdd(a:Int):Boolean{
    return a%2 !=0
}*/

data class User(val id:Int,val name:String)
data class PaidUser(val id:Int,val name:String,val tupe:String)
