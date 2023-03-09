
fun main(args: Array<String>) {
    /**
     * Тренеровка Вызов локальных функций, особенности функционального программирования, лямбда-выражения
     */
    outFunction("outer function")
    val mult: (Int, Int)-> Int = {x, y -> x*y }
    val sum = {x: Int, y: Int -> x+y }
    println(sum(190,5))

    val exam  = { println("Excellent!")}
    exam()
    exam()

    val programming = {println("Kotlin")}

    // тип юнит похож на тип void в java
    val description = programming()
    fun some() : Unit {}
    /**
     * Ключевое слово it
     */
    val doubling: (Int) -> Int = {it*it}
    println(doubling(3))

    val student: (String) -> String = {
        val age = 20
        "Меня зовут $it мне $age лет"
    }
    println(student("Максим"))


    /**
     * Тренировка расширения в Kotlin
     */
    val sentence: String = "Kotlin is a language for programming"
    println(sentence.countSymbols('i'))
    println("Kotlin is a language for programming".countSymbolsA())

    /**
     * Тренировка ключевое слово infix
     */
    println(1 sum 2)
    println(1.sum(2))

    println(1 big 3)
    println(3.big(2))


}
    /**
     * Тренеровка Вызов локальных функций, особенности функционального программирования, лямбда-выражения
     */
fun outFunction(outFun: String) {
    val outInt = 15

    fun inFunction(inFun: String){
        println(inFun)
        println(outFun)
        println(outInt)
    }
    inFunction("inner function")
}
/**
* Тренировка стилистики, расширения в Kotlin
*/
    fun String.countSymbols(c: Char) : Int {
    var count = 0
    for(n in 0..this.count()-1){
        if(this[n] == c) count++
    }
    return count
    }
fun String.countSymbolsA() : Int = length - replace("a","").length

/**
 * Тренировка ключевое слово infix
 */
infix fun Int.sum(i: Int) = this + i

infix fun Int.big(value: Int): Boolean = this>value