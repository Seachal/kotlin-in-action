package ch03

import ch03.ex3_4_1_NoOverridingForExtensionFunctions.View
import ch03.ex3_4_1_NoOverridingForExtensionFunctions.Button


fun View.showOff1() = println("I'm a view!")
fun Button.showOff1() = println("I'm a button!")
