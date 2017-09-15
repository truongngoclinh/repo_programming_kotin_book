package fundamental.classes

/**
 * OOP: Composition
 *
 * @author linhtruong
 * @date 9/13/17 - 10:49.
 * @organization VED
 */

class Composition(val panel: Panel) : UIElement by panel {
    fun test() {
        println("Height: ${panel.getHeight()}")
        println("Width: ${panel.getWidth()}")
    }
}

interface UIElement {
    fun getWidth(): Int
    fun getHeight(): Int
}

class Panel(val x1: Int, val x2: Int, val y1: Int, val y2: Int) : UIElement {
    override fun getHeight(): Int {
        return y2 - y1
    }

    override fun getWidth(): Int {
        return x2 - x1
    }
}

