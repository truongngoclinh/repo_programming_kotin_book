package fundamental.classes

import fundamental.Base
import java.util.*

/**
 * Test extension, pairs
 *
 * @author linhtruong
 * @date 9/15/17 - 11:24.
 * @organization VED
 */

class Extensions: Base() {

    override fun test() {
        fire()
        fire("AK46", true)

        var nullStr: Any? = null
        var str = "test"
        var nullStr2: Any? = null
        var intVar = Int.random()

        println("${nullStr.safeEquals(nullStr2)}")
        println("${nullStr.safeEquals(str)}")
        println("${str.safeEquals(nullStr)}")
        println("Extension companion: $intVar")

        val (pos, neg) = roots(9)
        println("pair is: $pos and $neg")

        infix()
    }

    fun fire() {
       println("just fire empty arg")
    }
}

fun String.printName(name: String) {
    println("String ext: $name")
}

fun Extensions.fire(type: String, reloaded: Boolean) {
    println("Firing with ${type.printName("LINH")}, reloaded enable? $reloaded")
}

fun Any?.safeEquals(other: Any?) : Boolean {
    if (this == null && other == null) {
        println("both are null but equality")
        return true
    }

    if (this == null) {
        println("null receiver, pls check")
        return false
    }

    println("just call normal equals method")
    return this.equals(other)
}

fun Int.Companion.random() : Int {
    return Random().nextInt(100)
}

fun roots(i : Int) : Pair<Double, Double> {
    require(i > 0) {
        "param must be positive number"
    }

    val root = Math.sqrt(i.toDouble())
    return Pair(root, -root)
}

fun infix() {
    val inf1 = "test" to "1"
    val inf2 = Pair("test", 1)
    val inf3 = mapOf("test" to 1, "test2" to 2, "test3" to 3)
    var inf4 = mutableMapOf<String, Int>()
    inf4.set("test", 1)
    inf4["test2"] = 2


    println("$inf1")
    println("$inf2")
    println("${inf3.entries}")
    println("${inf4.entries}")
}
