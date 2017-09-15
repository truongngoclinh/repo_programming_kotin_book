package fundamental.basics

import java.util.function.Consumer

/**
 * Test range syntax
 *
 * @author linhtruong
 * @date 9/12/17 - 11:35.
 * @organization VED
 */

class Ranges {

    val aToZ = "a".."z"
    val oneToNine = 1..9
    val isTrue = "c" in aToZ
    val isFalse = 10 in oneToNine
    val testOperators = (20.downTo(5)).step(2).reversed()

    fun test() {
        println("aToZ: $aToZ")
        println("oneToNine: $oneToNine")
        println("isTrue: $isTrue")
        println("isFalse: $isFalse")
        println("combineOperators: values: $testOperators")
        println("combineOperators: class: ${testOperators.javaClass}")
        testOperators.forEach(Consumer { i -> print("element: $i - ") })
    }
}