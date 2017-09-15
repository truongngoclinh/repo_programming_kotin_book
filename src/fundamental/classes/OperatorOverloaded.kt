package fundamental.classes

/**
 * CLASS DESCRIPTION
 *
 * @author linhtruong
 * @date 9/15/17 - 16:25.
 * @organization VED
 */

class OperatorOverloaded(val firstName: String, val lastName: String) {

    fun log() {
        println("$firstName $lastName")
    }

    operator fun plus(operatorOverloaded: OperatorOverloaded) : OperatorOverloaded {
        return OperatorOverloaded("${operatorOverloaded.firstName} with $firstName", "${operatorOverloaded.lastName} with $lastName")
    }

    fun test(opt: OperatorOverloaded) {
        (this + opt).log()
    }
}
 