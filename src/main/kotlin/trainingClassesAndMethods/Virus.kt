package trainingClassesAndMethods

/**
 * Тренировка методы класса в котлин
 */
class Virus(val name: String,val year: Int, val sick: Long = 0L, ) {
    fun printAward() {
        println("Virus: $name, sick people: $sick, year: $year ")
    }



}