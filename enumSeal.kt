fun main() {
    //val day=Day.SUNDAY
    /*
    println(day)
    println(day.number)

    for (i in Day.values()){
        println(i)
    }

     */
  //  day.printFormatedDay()

   /*
    //sealed classs
    val tile=Red("Mushroom",35)
    val tile2=Red("Fire",30)
    println("${tile.points}-${tile.type}")

    */

    val tile:Tile=Red("Mushroom",25)
    val points=when(tile){
        is Blue -> tile.points*2
        is Red -> tile.points*5
    }

    println(points)

}

/*
enum class Day(val number:Int){
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printFormatedDay(){
        println("Day is $this")

    }

}

 */

sealed class Tile
class Red(val type :String,val points:Int):Tile()
class Blue(val points:Int):Tile()