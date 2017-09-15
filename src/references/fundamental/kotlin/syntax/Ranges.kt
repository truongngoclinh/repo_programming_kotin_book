package net.milosvasic.fundamental.kotlin.syntax

/**
 * Created by mvasic on 6/5/16.
 */
// Iterating through the range
fun ranges1(x: Int) {
    for (x in 0..100) println("Number $x")
}

// Is x in range?
fun ranges2(x: Int) {
    if (x !in 0..100) println("No x in range")
}
