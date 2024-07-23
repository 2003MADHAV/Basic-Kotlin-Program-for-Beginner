fun main() {
    MyClass.MyObject.f()
    MyClass.MyObject1.g()
    MyClass.f()

}

class MyClass{
   companion object MyObject{
       @JvmStatic
        fun f(){
            println("Hello! I am F from object")
        }
    }
    object MyObject1{
        fun g(){
            println("Hello! I am G from object1")
        }
    }
}