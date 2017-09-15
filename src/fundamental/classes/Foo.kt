package fundamental.classes

/**
 * Sample class
 *
 * @author linhtruong
 * @date 9/12/17 - 11:32.
 * @organization VED
 */
 
class Foo(val name: String, val age: Int?) {

    init {
        if (age != null) {
            require((age !in 0..100)) {
                println("Invalid age")
            }
        }
    }

    constructor(name: String): this(name, 0)

}