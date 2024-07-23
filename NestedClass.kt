fun main() {
    val obj=Outer()
    obj.i

    // do not call directly inner classs so geeting error

    // object for outer class

    //val nested=Outer.Nested()
    //nested.test()

    // object of inner class
    val inner=Outer().Nested()
    inner.test()
}
class Outer{
    var i=0
   // class  Nested{
    // creating Inner class
   inner class  Nested{
        fun test(){
            println("This is nested class")
        }
    }
}