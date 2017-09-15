package fundamental.classes

/**
 * Sample class
 *
 * @author linhtruong
 * @date 9/13/17 - 09:15.
 * @organization VED
 */

class Bar(firstName: String, lastName: String, howOld: Int?) {

    private var name: String
    private var age: Int?

    init {
        this.name = "$firstName + $lastName"
        this.age = howOld
    }

    fun getName(): String = this.name

    fun getAge(): Int? {
        return this.age
    }
}
