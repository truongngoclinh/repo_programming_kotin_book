package fundamental.basics

/**
 * CLASS DESCRIPTION
 *
 * @author linhtruong
 * @date 9/15/17 - 16:34.
 * @organization VED
 */
 
class Operators {

    fun test() {
        // add
        val add = 1 + 2
        val addOp = 1.plus(2)

        // div
        val div = 1 / 2
        val divOp = 1.div(2)

        // sub
        val sub = 1 - 2
        val subOp = 1.minus(2)

        // mul
        val mul = 1 * 2
        val mulOp = 1.times(2)

        // %
        val rem = 3 % 2
        val remOp = 3.rem(2)

        // range
        val range = 1..5
        val rangeOp = 1.rangeTo(5)

        var inOp = 2 in range
        var containOp = range.contains(2)

        // pos
        val pos = +1
        val posOp = 1.unaryPlus()

        // neg
        val neg = -1
        val negOp = 1.unaryMinus()

        // not
        val not = true
        val notOp = true.not()
    }
}