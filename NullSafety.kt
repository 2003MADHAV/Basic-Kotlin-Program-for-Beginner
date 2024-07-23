fun main() {
    var gender:String="Male"   //   "Female ", "Oters"
    var gender2:String?= null
    var isAdult:Boolean?=true

    if (gender2 != null) {
       println(gender2.toUpperCase())
    }

   println(gender2?.toUpperCase())

    gender2?.let {
        println("line 1")
        println("line 2  $gender2")
        println("line 3 $it")
    }
   // gender.let {  }
    var selectedValue=gender2?:"NA"

    var value= gender2!!.toUpperCase()

}