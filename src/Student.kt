open class Student(val name: String, val age: Int) {
    var lastname: String = ""
        get() = field
        set(value) {
            field = value
        }
}
class Teacher : Student("",20)