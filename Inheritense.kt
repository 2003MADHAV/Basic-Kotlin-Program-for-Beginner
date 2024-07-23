fun main() {
    val myDog = Dog("Buddy")
    myDog.makeSound() // Output: Woof!
}
open class Animal(val name: String) {
    open fun makeSound() {
        println("Some generic sound")
    }
}

class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("Woof!")
    }
}