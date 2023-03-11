package trainingClassesAndMethods

class Parrot {
    var nickname = " "
        get()= field.lowercase().replaceFirstChar {it.uppercase()}
    var age = 0
        set(value) {
            if (value >0){
                field = value
            }
        }
}