package fundamental.classes

/**
 * Enumeration test
 *
 * @author linhtruong
 * @date 9/13/17 - 09:35.
 * @organization VED
 */

enum class Date(val lowercase: String): Log {

    MONDAY("monday") {
        override fun print() {
            println("Today is ${Date.MONDAY.lowercase}")
        }
    },
    TUESDAY("tuesday") {
        override fun print() {
            println("Today is ${Date.TUESDAY.lowercase}")
        }
    }
}

internal interface Log {
   fun print()
}