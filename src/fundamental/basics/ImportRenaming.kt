package fundamental.basics

import fundamental.classes.Foo as Foo2

/**
 * Test dup import class
 *
 * @author linhtruong
 * @date 9/12/17 - 11:32.
 * @organization VED
 */

class ImportRenaming {

    fun test() {
        val foo1 = Foo()
        val foo2 = Foo2("", 0)
    }
}