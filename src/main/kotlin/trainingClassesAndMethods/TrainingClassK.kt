package trainingClassesAndMethods

class TrainingClassK constructor(_name: String, _isPassed: Boolean) {

    val name: String
    val isPassed: Boolean
    var mark: Double? = 0.0
    init {
        name = _name
        isPassed = _isPassed
    }

    constructor(_name: String, _isPassed: Boolean, _mark: Double): this(_name, _isPassed) {
        mark = _mark
    }
}