package fundamental.basics

import java.io.File

/**
 * Test equality
 *
 * @author linhtruong
 * @date 9/12/17 - 15:00.
 * @organization VED
 */

class Equality {

    val a = File("/test.doc")
    val b = File("/test.doc")

    fun test() {
        println("Referential equality: ${a === b}")
        println("Structural equality: ${a == b}") // null safe operator
    }
}
 