package ch04.main

class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() {
//        调用父接口
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
//    可以重新定义ssetFocus方法的行为，或者如果你对默认行为感到满意也可以直接省略它
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}
