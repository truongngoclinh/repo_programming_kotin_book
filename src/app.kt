import fundamental.basics.*
import fundamental.classes.*
import fundamental.functions.Functions
import fundamental.functions.globalFun
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver

/**
 * CLASS DESCRIPTION
 *
 * @author linhtruong
 * @date 9/12/17 - 10:39.
 * @organization VED
 */

fun main(args: Array<String>) {
    println("Hello fundamental kotlin!")
    println("===================================")

//    testValsAndVars()
//    testTypes()
//    testRanges()
//    testLoop()
//    testEquality()
//    testThisExp()
//    testControlFlow()
//    testCast()
//    testWhen()
//    testReturn()
//    testClasses()
//    testFun()
//    testExtension()
    testOperatorOverloaded()
}

fun testValsAndVars() {
    val mValsAndVars = ValsAndVars()
    mValsAndVars.test()
}

fun testTypes() {
    val mTypes = Types()
    mTypes.test()
}

fun testRanges() {
    val mRanges = Ranges()
    mRanges.test()
}

fun testLoop() {
    val mLoops = Loops()
    mLoops.test()
}

fun testEquality() {
    Equality().test()
}

fun testThisExp() {
    ThisExpression().test()
}

fun testControlFlow() {
    ControlFlow().test()
}

fun testCast() {
    Cast().test()
}

fun testWhen() {
    When().test()
}

fun testReturn() {
    Return().test()
}

fun testClasses() {
    Outer("LINH") .Inner("TRUONG").log()
    Date.MONDAY.print()
    Moose("Duckies").log()
    Composition(Panel(1, 5, 4, 3)).test()
}

fun testFun() {
    Functions().typeCheck(-1..5)
    globalFun(10)
}

fun testExtension() {
    String().printName("LINH")
    Extensions().test()
}

fun testOperatorOverloaded() {
    OperatorOverloaded("SM", "BOI").test(OperatorOverloaded("Linh", "Truong"))
    var chestBoard = ChestBoard()
    chestBoard.set(1, 1, chestBoard.random())
    chestBoard.set(4, 3, chestBoard.random())
    chestBoard.test()
}
