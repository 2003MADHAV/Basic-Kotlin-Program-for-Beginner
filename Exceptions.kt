import java.lang.IllegalArgumentException

fun main() {
    //try ,catch and finally keyword
    /*
    val arr= arrayOf(1,2,3)
    try {
        println(arr[5])
    }
    catch (e:Exception){
        println("please check the array index")
    }
    catch (ex:NullPointerException){
        println("")
    }
    finally{
        println("I will execute no matter what")
    }
    println("This will not run and compiler")

    //try allways come with catch or finally
    try {

    }
    catch (em:NegativeArraySizeException){

    }
    try {

    }
    finally {

    }

     */

    // throw key word for call the function

    createUserList(5)
    createUserList(-2)



}

// throw key word fur function
fun createUserList(count:Int){
    if (count<0){
        //Exception
        throw IllegalArgumentException("count must be grater than 0")
    }
    else{
        println("User list created $count users")
    }
}
