package trainingClasses

import javax.management.Query.and

class Student {
    var name: String? = null
        get() {
            return if(field==null){
                ""
            } else {
                field
            }
        }
    var surname: String? = null
        get() {
            return if(field==null){
                ""
            } else {
                field
            }
        }
    var mark: Double = 0.0
        set(value) {
            if (((value)>0.0) and (value <100.0)){
                field = value
            }
        }


    }

