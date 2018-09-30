package george.curious.transsion.lib.list

import java.util.*

/**
 * Created by jian.shui on 2018/9/27
 */
object StackDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        testStack()

    }

    private fun testStack() {
        /***
         * 栈是一种只能在一端进行插入或删除操作的线性表
         * 特性：先进后出
         */
        val stack = Stack<String>()
        //进栈push()
        stack.push("1")
        stack.push("2")
        stack.push("3")
        stack.push("4")
        stack.add("5")
        println("statck data:" + stack.toString())
        // 取栈顶值（不出栈）
        println("stack top:" + stack.peek())
        //出栈
        //  stack.pop();
        // stack.pop();
        //stack.pop();
        println("stack data:" + stack.toString())
        println("stack is empty:" + stack.empty())
        val index = stack.search("3")//计数从顶部开始
        println("stack search index:$index")
        println("stack search result:" + stack[0])

        val list = ArrayList<String>()
        list.add("1")
        list.add("2")
        list.add("3")
        println("list is empty:" + list[2])
        val iterator = list.iterator()
        while (iterator.hasNext()) {
            println(iterator.next())
        }
    }
}
