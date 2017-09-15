package fundamental.classes

/**
 * Abstract vs Interface
 * - Is-A vs Can-Do
 * - Code reuse: only need to implement subset of methods in abstract class
 * - Versioning: problem when adding new method on interface, easy life in abstract
 *
 * Polymorphism
 * - Object of derived class are treated as object of the base class
 * - Abstract method
 *
 * @author linhtruong
 * @date 9/13/17 - 09:53.
 * @organization VED
 */

open class Birds(val name: String) {
}

interface Swing {
    fun swing()
}

interface Swim {
    fun swim()
}

class Moose(name: String): Birds(name), Swing, Swim {

    override fun swim() {
        println("$name can swim")
    }

    override fun swing() {
        println("$name can swing")
    }

    fun log() {
        swim()
        swing()
    }
}
