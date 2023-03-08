/**
 * Тренеровочные задания на стилистику кода в KOTLIN и элементарные функции
 * Особенности операторов KOTLIN
 */
fun main(args: Array<String>) {

    /**
     * Объявление функций
     */

    fun mult(x: Int): Int {
        return 2 * x
    }

    fun mult1(x: Int): Int = 2 * x

    fun mult2(x: Int) = 2 * x

    /**
     * Элементарные циклы while / do while / for, стилистика KOTLIN
     */
    var i = 10

    while (i > 0) {
        println(i)
        i--
    }

    do {
        i++
        println(i)
    } while (i < 10)

    for (i in 1..4)
        println(i)

    /**
     *  Операторы until / downTo / step для цикла for стилистика KOTLIN
     *  пример таблицы умножения в стилистике котлин
     */

    for (i in 10 downTo 4 step 2)
        println(i)

    for (i in 1 until 12)
        println(i)

    for (i in 1..10 step 1){
        for (j in 1..10 step 1) {
            print("${i * j}\t")
        }
        println()
    }

    /**
     * Особенности использования for в массивах
     */

    val arrayNum = arrayOf(1,2,3,4,5,6,7,8)

    for (num in arrayNum) {
        println(num)
    }

    for (num in arrayNum.indices) {
        println("$num: ${arrayNum[num]}")
    }

    for (num in 1..7) {
        println("$num: ${arrayNum[num]}")
    }

    for (num in 5 until 9) {
        println("$num: ${arrayNum[num]}")
    }

    for (num in 9 downTo 3 step 3) {
        println("$num: ${arrayNum[num]}")
    }

    /**
     * Параметры по умолчании, именованные параметры
     */

    studentsList("Petrov", "Petr", 70)
    studentsList(name = "Petr", surname =  "Petr", mark =  70)
    studentsList("Ivanov", "Ivan")
    studentsList(surname = "Ivanov", name = "Ivan")

    println(sum(1,2,3,4))
    println(sum(1,2,3))
    println(sum(2,3))

}

fun studentsList (surname: String, name: String, mark: Int = 0){
    println("Surname: $surname")
    println("Name: $name")
    println("Mark: $mark")
}

fun sum (a: Int, b: Int, c: Int = 0, d: Int = 0) = a+b+c+d

