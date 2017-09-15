package fundamental.basics

/**
 * Test val & var keyword
 *
 * @author linhtruong
 * @date 9/12/17 - 10:42.
 * @organization VED
 */

class ValsAndVars {

    val immutableVar = "immutableVar"
    var mutableVar = "mutableVar"

    // type inference
    var type: Number = 123.123
    var type2: String = "123.123"

    fun test() {
        println(immutableVar)
        println(mutableVar)
        mutableVar = "mutableVar changed value"
        println(mutableVar)
        println(type.javaClass)
        println(type2.javaClass)
    }
}