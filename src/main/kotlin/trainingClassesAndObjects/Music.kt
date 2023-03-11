package trainingClassesAndObjects

class Music {
    private var countBand =5678
    fun printBand(){
        println("$countBand")
    }

    inner class Band{

        fun classicMusic(count: Int){
            countBand = count
            printBand()
        }
    }
}