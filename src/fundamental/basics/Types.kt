package fundamental.basics

/**
 * Test basic types
 *
 * @author linhtruong
 * @date 9/12/17 - 10:59.
 * @organization VED
 */

class Types {

    var int = 123
    var long = 123L
    var float = 123F
    var double = 12.3 // default for floating point numbers
    val hexadecimal = 0xAB
    var binary = 0b010101

    val x = 1
    val y = 2
    val z = 3
    val isTrue = x < y && x < z
    val alsoTrue = x == y || y == z // if left-hand side satisfies the clause, the right-hand side will not be evaluated

    val uniChar = "\u1234"
    val escaptedString = "string with \n new line"
    val unescaptedString = """string with \n new line"""
    val unescaptedString2 = """
        raw string  that span many lines """

    val array = arrayOf(1, 2, 3, "str", 12.23)
    val array2 = Array(5, {i -> i * i})
    val bArray = BooleanArray(5, {k -> (k % 2 == 0)})

    fun test() {
        val convertIntToDouble = int.toDouble()
        val convertIntToChar = int.toChar()
        println("convertIntToDouble: $convertIntToDouble\nconvertIntToChar: $convertIntToChar")

        val leftShift = 1 shl 2
        println("leftShift: $leftShift")

        val rightShift = 1 shr 2
        println("rightShift: $rightShift")

        val and = 1 and 0x00001111
        val or = 1 or 0x00001111
        val xor = 1 xor 0x00001111
        val inv = 1.inv() // not binary operator, but a unary operator
        println("and: $and\nor: $or\nxor: $xor\ninv: $inv")

        println("isTrue: $isTrue\nalsoTrue: $alsoTrue")
        println("uniChar: $uniChar")

        println("escapedString: $escaptedString")
        println("unescapedString: $unescaptedString")
        println("unescapedString2: $unescaptedString2")

        println("array: " + array.contentToString() + "\nelement: " + array.get(1))
        println("array2: ${array2.contentDeepToString()}" + "\nelement: " + array2[1])

        println("booleanArray:" + bArray.contentToString())
    }
}
