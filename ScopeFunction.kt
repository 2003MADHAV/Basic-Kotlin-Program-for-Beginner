fun main() {
    //val emp=Employee()
    val emp:Employee=Employee()
    emp.age=20
    emp.name="madhav"

   /* //using safe call operator
    val emp:Employee?=null
    emp?.age=20
    emp?.name="madhav"*/

   /* emp.apply {
        age=30
        name="madhav"
    }
    println(emp)*/

/*
    println(emp.age)
    println(emp.name)

    var x=emp.let {
        println(it.name)
        println(it.age)
        2
    }
*/
  /*  emp?.let {
        it.age=20
        it.name="kumar"
    }*/

    emp.let {
        it.age=20
        it.name="kumar"
    }
    with(emp){
        age=30
        name="choudhary"
    }
    emp.run {
        age=35
        name="keshav"
    }

}

data class Employee(var name:String="",var age:Int=28)