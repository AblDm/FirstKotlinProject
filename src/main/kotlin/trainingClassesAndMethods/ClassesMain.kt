package trainingClassesAndMethods

    fun main(args: Array<String>) {
        /**
         * Тренировка работа с геттерами и сеттерами, constructor в котлин
         */
        val student = Student()
        println(student.name)
        println(student.surname)
        println(student.mark)

        val ivan = Student()
        ivan.name = "Ivan"
        ivan.surname = "Ivanov"
        ivan.mark = 4.0

        val petr = Student()
        petr.mark = 4.5
        petr.name = "Petr"
        petr.surname = "Petrov"
        println("${ivan.name } : ${ivan.mark}")

        /**
         * Тренировка работа с геттерами и сеттерами в котлин
         */
        val parrot1 = Parrot()
        parrot1.nickname = "miko"
        parrot1.age = 2
        println("${parrot1.nickname}, ${parrot1.age}")

        /**
         * Тренировка работа с констурктором в котлин
         */
        val aircraft = Airplane(156, 2015, "Airbus A-319")
        println("${aircraft.seats}, ${aircraft.model}, год выпуска ${aircraft.year}")
        aircraft.model = "Airbus A-419"
        //aircraft.year = 2022

        /**
         * Тренировка работа с функцией расширения в котлин
         */

        var nissan = Car(Type.AUTO, "Nissan", 1999)
        nissan.printAll()

        /**
         * Тренировка методы классов и внешние функции в Kotlin
         */

        val task2: TrainingClassK = TrainingClassK("Вторичный конструктор", true, 2.4)
        val task1: TrainingClassK = TrainingClassK("Первичный конструктор", true)
        val ebola = Virus("ebola", 2013, 28640L)
        ebola.isVaccineFound()
        val covid19 = Virus("COVID-2019", 2019, 681453157L)
        covid19.printAward()
        covid19.isVaccineFound()




    }

fun Virus.isVaccineFound() = println(((year>1918) and (year<2020)))

fun Car.printAll() {
    println("$type, $model, $year")
}