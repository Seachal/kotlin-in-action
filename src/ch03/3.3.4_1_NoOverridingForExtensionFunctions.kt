package ch03.ex3_4_1_NoOverridingForExtensionFunctions

/**
 * 不可重写扩展函数
 */
open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun main(args: Array<String>) {
    val view: View = Button()
    view.click()
}
