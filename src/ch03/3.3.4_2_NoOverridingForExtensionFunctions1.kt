package ch03.ex3_4_2_NoOverridingForExtensionFunctions1

/**
 * 不可重写扩展函数
 */
open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main(args: Array<String>) {
    val view: View = Button()
//    当这个函数被调用时，由变量 view的静态类型 View决定，而不是 view的运行时类型 Button
    view.showOff()
}
