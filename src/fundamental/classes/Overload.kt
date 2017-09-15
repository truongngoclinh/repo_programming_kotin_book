package fundamental.classes

/**
 * Rewritten overload method with kotlin
 *
 * @author linhtruong
 * @date 9/15/17 - 09:24.
 * @organization VED
 */

class Overload(val name: String, val registered: Boolean, id: Int) {

    // 1 constructor for all
    constructor(name: String) : this(name, false, 0)
    constructor(name: String, registered: Boolean) : this(name, registered, 0)

    // 1 method no others overloaded
    fun overloadMethod(name: String, registered: Boolean = false, id: Int = 0) {

    }

    fun test() {
        overloadMethod("LINH", false)
        overloadMethod("LINH1")
    }
}