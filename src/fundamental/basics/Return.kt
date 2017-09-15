package fundamental.basics

/**
 * Test creating array
 *
 * @author linhtruong
 * @date 9/12/17 - 16:41.
 * @organization VED
 */

class Return {

    val list = arrayOf("one", "two", "stop", "three")

    fun test() {
        list.forEach stop@ {
            if (it == "stop") return@stop
            else println("$it")
        }

        list.forEach {
            if (it == "stop") return
            else println("$it") // no "three" printed
        }
    }
}
 
 