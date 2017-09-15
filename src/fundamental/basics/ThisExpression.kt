package fundamental.basics

/**
 * This was reference to receiver
 *
 * @author linhtruong
 * @date 9/12/17 - 15:05.
 * @organization VED
 */

class ThisExpression {

    fun test() {
        printMe()

        Student("LINH").printName()
    }

    fun printMe() = println(this)

    inner class Student(name: String) {

        var name = "TEST"

        fun printName() = println("${this@ThisExpression} ${this.name}")
    }
}

// extension
