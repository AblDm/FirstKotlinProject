fun main(args: Array<String>) {
    /**
     * Аргументы переменной длинны
     */
    println(sum(2,4,2,5))
    printAll(3,"One","Two")
    /**
     * Исключчения в котлин
     */

    var number =0
    if (number !in 0..10) {
        throw IllegalArgumentException(
            "Value must be between 0 and 10"

        )
    }


}

fun sum(vararg grade: Int) : Int {
    var result = 0
    for (num in grade){
        result+= num
    }
    return result
}

fun printAll(grade: Int, vararg messages: String) {
    println("grade:$grade")
    for (m in messages)
        println(m)
}


