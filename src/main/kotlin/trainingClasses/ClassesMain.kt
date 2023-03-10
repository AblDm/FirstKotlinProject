package trainingClasses

    fun main(args: Array<String>) {
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


    }
