fun main() {
    val oneplus=OnePlus("Smartphone")
    oneplus.display()
    val genralMobile=Mobile("General")
    genralMobile.display()
    println(oneplus.toString())
}
open class Mobile(val type:String){
    open val name:String=""
     open val size:Int=5
    fun makecall()= println("Calling from Mobile")
    fun poweroff()= println("shutting Down")
    open fun display()= println("Simple mobile Display")
}
class OnePlus(typeParam:String): Mobile(typeParam)
{
    override val name: String="One plus"
    override val size: Int=6
    override fun display() {
        super.display()
        println("one Plus Display")
    }

    override fun toString(): String {
        return "Nmae- $name-size-$size"
    }
}