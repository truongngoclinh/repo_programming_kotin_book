package fundamental.functions

/**
 * Function types
 *
 * @author linhtruong
 * @date 9/13/17 - 11:31.
 * @organization VED
 */

class Functions {

    /**
     * single line
     */
    fun singleLineFunc(x: Int): Int = x * x

    /**
     * support local fun, use outer params
     */
    fun add(x: Int, y: Int): Int {
        fun localFunc(): Int = x * y

        return localFunc() * x
    }

    /**
     * anther local fun advantage
     */
    fun typeCheck(progression: IntProgression) {
        for (k in progression) {
            fun isPositive() = k >= 0
            fun isNegative() = k < 0
            fun isOdd() = isPositive() && k % 2 != 0
            fun isEven() = isPositive() && k % 2 == 0

            when {
                isOdd() -> println("Odd number")
                isEven() -> println("Even number")
                isNegative() -> println("Negative number")
            }
        }
    }

    /**
     * Test name params
     */
    fun testNameArgs() {
        // TODO: not working
//        add(firstValue = 14, secondValue = 15)
    }
}

/**
 * global function
 * fucking global static?
 */
fun globalFun(x: Int?) {
    if (x != null) {
        require(x > 0, {
            println("x need to be positive number")
        })

        println("valid x: $x")
    }
}