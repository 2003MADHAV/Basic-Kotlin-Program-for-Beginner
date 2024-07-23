fun main() {
    val student1=Attendencesys("madhav",41470,"s4",5.35)
   val student2=Attendencesys("Rahul kumar",41485,"s5",9.23)

    println("information of first student")
    println(student1.Stdname)
    println(student1.regno)
    println(student1.Stdname)
    println(student1.section)
    println(student1.time)
    println("infomation of second student")
    println(student2.Stdname)
    println(student2.regno)
    println(student2.section)
    println(student2.time)



}
class Attendencesys(val Stdname:String,val regno:Int,val section:String,var time:Double )
{
    fun presant(){

        println("Attendence is completed ")
    }

    fun Absent(){
        println("Attendence not yet complete")
    }
}