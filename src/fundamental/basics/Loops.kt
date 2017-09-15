package fundamental.basics

/**
 * Test for each
 *
 * @author linhtruong
 * @date 9/12/17 - 11:45.
 * @organization VED
 */

class Loops {

    val oneToThree = 1..3
    val str = "print me"
    val array = arrayOf("one", 2, "three", 4, "five")

    fun test() {
        for (i in oneToThree) {
            for (j in 1..2) {
                print("${i * j} ")
            }
        }

        println()
        for (i in str) {
            print("$i ")
        }

        println()
        for (i in array.indices) {
            print("$i - ${array[i]} ")
        }
    }
}