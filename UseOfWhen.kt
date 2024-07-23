fun main() {

    val name="madhav kumar"
/*
    if (name=="Shivam kumar"){
        println("this is my brother's son ")
    }
    else if (name=="kumar") {
        println("This only last name")
    }
    else if (name== "keshav "){
        println("this my elder brother")
    }
    else if (name=="madhav kumar"){
        println("This is my name ")
    }
    else{
        println("name not found")
    }

 */
    /*
    when(name){
        "Shivam kumar" -> println("this is my brother's son")
        "keshav" -> println("This my brother name")
        "kumar" -> println("this my last name ")
        "madhav kumar" -> println("This my name only")
        else -> println("not found any name")
    }

     */

    val result =when(name){
        "Shivam kumar" -> println("this is my brother's son")
        "keshav" -> println("This my brother name")
        "kumar" -> println("this my last name ")
        "madhav kumar" -> println("This my name only")
        else -> println("not found any name")
    }
    println(result)


}