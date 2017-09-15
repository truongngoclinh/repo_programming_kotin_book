package fundamental.classes

/**
 * Outer & Inner
 * - nested class: static
 * - inner class: normal
 *
 * @author linhtruong
 * @date 9/13/17 - 09:28.
 * @organization VED
 */

class Outer(var field: String) {

    inner class Inner(var field: String) {

        fun log() {
            println("Inner's field: $field")
            println("Outer's field: ${this@Outer.field}")
        }
    }
}