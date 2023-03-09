fun main(args: Array<String>) {

    /**
     * Аргументы переменной длинны
     */
    println(sum(2, 4, 2, 5))
    printAll(3, "One", "Two")

    /**
     * Исключчения в котлин
     */
    var number = 0
    if (number !in 0..10) {
        throw IllegalArgumentException(
            "Value must be between 0 and 10"

        )
    }

    /**
     * Тренировка вывод диапазон символов от 'б' до 'к' с помощью цикла
     */
    for(sym in 'б'..'к') {
        print(sym)
    }

    /**
     * Тренировка функция нахождения наименьшего числа из 2х целочисленных
     */
    println("\n" +findMin(-4, -5))

    /**
     * Тренировка установка значения префикса к строкам
     */
    printPrefix("one", "two", "three", prefix ="number " )

}
/**
 * Аргументы переменной длинны
 */
fun sum(vararg grade: Int) : Int {
    var result = 0
    for (num in grade){
        result+= num
    }
    return result
}
/**
 * Аргументы переменной длинны
 */
fun printAll(grade: Int, vararg messages: String) {
    println("grade:$grade")
    for (m in messages)
        println(m)
}

/**
 * Тренировка проверка наличия символа в диапазоне
 */
fun isLetter( c:Char) = c in 'a'..'z' || c in 'A'..'Z'
fun checkNumber (c:Char) = c !in '0'..'9'

/**
 * Тренировка функция нахождения наименьшего числа из 2х целочисленных
 */
fun findMin(n1: Int, n2: Int, abs: Boolean = false): Int {
    val v1: Int
    val v2: Int

    if (abs){
        v1 = Math.abs(n1)
        v2 = Math.abs(n2)
    } else{
        v1 = n1
        v2 = n2

    }
    return if (v1 <v2) n1 else n2
}

/**
 * Тренировка установка значения префикса к строкам
 */

fun printPrefix(vararg words: String, prefix: String) {
    for (m in words)
        println(prefix + m)
}