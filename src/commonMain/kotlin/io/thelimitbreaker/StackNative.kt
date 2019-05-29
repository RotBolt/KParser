package io.thelimitbreaker

class StackNative<T> {

    private val stack = ArrayList<T>()
    private var top = -1
    fun push(item: T) {
        stack.add(item)
        ++top
    }

    fun pop(): T {
        val item = stack[top--]
        if (isMoreHalfEmpty()){
            freeEmptySpace()
        }
        return item
    }

    fun peek() = stack[top]

    fun size() = top+1

    fun isEmpty() = top == -1

    private fun isMoreHalfEmpty() = top < (stack.size - 1) / 2

    private fun freeEmptySpace() {
        for (i in (top + 1) until stack.size) {
            stack.removeAt(i)
        }
    }
}