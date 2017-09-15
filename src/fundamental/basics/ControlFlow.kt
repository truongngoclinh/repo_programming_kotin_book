package fundamental.basics

import java.io.File
import java.io.InputStream
import java.util.*

/**
 * if..else and try..catch are now expression not statement in Java
 * completely avoid use case of declaring a var outside of an if statement
 * to then initialize it inside either branch
 *
 * @author linhtruong
 * @date 9/12/17 - 15:23.
 * @organization VED
 */

class ControlFlow {

    val cal = Calendar.getInstance()
    val isToday = if (cal.get(Calendar.YEAR) == 2017) true else false
    val file = File("etc/test")

    fun isZero(x: Int): Int {
       return if (x == 0) 0 else -1
    }

    fun test() {
        println("isToday: $isToday")
        println("isZero: ${isZero(1)}")

        println("readFile: ${readFile()}")
    }

    fun readFile(): Boolean {
        return try {
            if (!file.exists()) {
               file.mkdir()
            }
            val inputStream = file.inputStream()
            inputStream.read()
            true
        } catch (e: Exception) {
            println("exception: $e")
            false
        }
    }
}