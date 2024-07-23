fun main() {

    /*val obj=IntContainer(3)
    obj.getValue()
    val intContainer=Container<Int>(3)
    intContainer.getValue()

    val sContainer=Container<String>("Heloo welcome")
    sContainer.getValue()

    val list= listOf<String>()*/

    add(1,2,3,4,5,6)
    add(1,1,1,1,1,1,1,1,1,1)

}
/*

class Container<T>(var data:T){
    fun setValue(value:T){
        data=value
    }

    fun getValue():T{
        return  data
    }
}

class IntContainer(var data:Int){
    fun setValue(value:Int){
        data=value
    }

    fun getValue():Int{
        return  data
    }
}

class StringContainer(var data:String){
    fun setValue(value:String){
        data=value
    }

    fun getValue():String{
        return  data
    }
}
*/

fun add(vararg values:Int){
    var sum=0
    for (i in values){
        sum +=1
    }
    println(sum)
}
