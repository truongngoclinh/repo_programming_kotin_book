package fundamental.basics

/**
 * Test When
 *
 * @author linhtruong
 * @date 9/12/17 - 16:26.
 * @organization VED
 */

class When {

    fun test() {
        testWhenValue(0)
        testWhenValue(1)
        testWhenValue(10)
        testWhenValue(-5)

        println("isZeroOrOne ${isZeroOrOne(1)}")
        println("isZeroOrOne ${isZeroOrOne(10)}")

        testWhenWithoutArg(1, 3)
    }

    /**
     * alternative to switch..case
     * if 1 case was satisfied, others will be omitted
     */
    fun testWhenValue(x: Any) {
        when (x) {
            0 -> println("x is zero")
            1 -> println("x is 1")
            in 2..5 -> println("x is small")
            in -10..-1 -> println("x is negative")
            is Int -> println("multi-cases satisfied?")
            else -> println("x is other")
        }
    }

    fun testWhenWithoutArg(x: Int, y: Int) {
        when {
            x < y -> println("x is less than y")
            x > y -> println("x is greater than y")
            else -> println("x must equal y")
        }
    }

    fun isZeroOrOne(x: Int): Boolean {
        return when(x) {
            justReturn0(), 1 -> true
            else -> false
        }
    }

    fun justReturn0(): Int {
        return 0
    }
}