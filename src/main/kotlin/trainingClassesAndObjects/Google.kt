package trainingClassesAndObjects

class Google: Android, Firebase {
    override fun run() = println("Android is run")
    override fun stop() {
        super<Android>.stop()
        super<Firebase>.stop()
    }


}