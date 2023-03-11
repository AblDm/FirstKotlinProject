package trainingClassesAndObjects

/**
 * Тренировка использования дата классов в Kotlin
 */

data class Student (val name: String, val mark: Int, val exams: Int) {
    val subject =12

    override fun toString(): String {
        return "Student {name = '$name', mark = '$mark', exams = '$exams', subject = $subject }"
    }


}