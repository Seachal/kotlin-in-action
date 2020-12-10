package ch04.ex1_2_2_OpenFinalAbstractModifiers1

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton : Clickable {
//    加 final  是因为，重写后，默认是 open,如果并不想让他 open 就 final 。
    final override fun click() {}
}
