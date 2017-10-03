package fundamental.classes

import java.util.*

/**
 * Chestboard: test overloaded func
 *
 * @author linhtruong
 * @date 9/15/17 - 16:41.
 * @organization VED
 */

class ChestBoard {

    private val CHEST_SIZE = 64
    private var mBoard: Array<Element>

    init {
        mBoard = Array(CHEST_SIZE, { Element.Empty })
    }

    operator fun get(rank: Int, file: Int) : Element = mBoard[file * 8 + rank]

    operator fun set(rank: Int, file: Int, type: Element) {
        mBoard[file * 8 + rank] = type
    }

    // not working
    operator fun invoke() {
        println("test parentheses overloaded by invoke")
        
    }

    fun test() {
        mBoard.forEachIndexed { i, element ->
            if (element != Element.Empty) {
                println("found living at index $i: \n- ordinal: ${element.ordinal} \n- name: ${element.name}")
            }
        }
    }

    enum class Element {
        Empty, Pawn, Bishop, Knight, Rook, Queen, King
    }
}

fun ChestBoard.random() : ChestBoard.Element {
    return ChestBoard.Element.values()[Random().nextInt(6)]
}