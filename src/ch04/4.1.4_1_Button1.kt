package ch04.Button1

import java.io.Serializable

interface State: Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) { /*...*/ }

//    嵌套类，不持有外部类的引用
    class ButtonState : State { /*...*/ }
}
