package fundamental.basics

import java.io.File

/**
 * How to cast object type
 *
 * @author linhtruong
 * @date 9/12/17 - 16:18.
 * @organization VED
 */

class Cast {

    var any: Any = "home/dir"
    var str: String? = null
    var file: File? = null

    fun test() {
        var str = ""
        println("cast: ${str is String}")
        println("testSmartCast: ${testSmartCast("LINH")}")

        try {
            str = any as String
            file = any as File
            println("$str - $file")
        } catch (e: Exception) {
            println("$e")
        }
    }

    fun testSmartCast(obj: Any): Boolean {
        return obj is String && obj.length > 0
    }
}