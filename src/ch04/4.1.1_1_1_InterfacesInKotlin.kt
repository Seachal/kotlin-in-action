package ch04

interface Clickable {
    fun click() = println("I was clicked")
}

// 如果接口有 click的默认实现click（），Button1 可以选择不重写click（）；
// 如果接口没有默认实现click（），Button1需要重写click（）
class Button : Clickable {
}

fun main(args: Array<String>) {
    Button().click()
}
