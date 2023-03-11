package trainingClassesAndObjects

open class Phone (val os: String, val model: String, val cost: Int){
    fun printInfo(): String {
        return "OS: $os, Model:$model, Cost: $cost$"
    }
    fun isExpensiveMore300() : Boolean {
        return cost >300
    }
}