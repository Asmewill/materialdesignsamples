package george.curious.transsion.lib.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Created by jian.shui on 2018/9/27
 */
public class StackDemos {
    public static void main(String[] args){
        testStack();

    }

    private static void testStack() {
        /***
         * 栈是一种只能在一端进行插入或删除操作的线性表
         * 特性：先进后出
         */
        Stack<String> stack=new Stack<>();
        //进栈push()
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.add("5");
        System.out.println("statck data:"+stack.toString());
        // 取栈顶值（不出栈）
        System.out.println("stack top:"+stack.peek());
        //出栈
        //  stack.pop();
        // stack.pop();
        //stack.pop();
        System.out.println("stack data:"+stack.toString());
        System.out.println("stack is empty:"+stack.empty());
        int index=stack.search("3");//计数从顶部开始
        System.out.println("stack search index:"+index);
        System.out.println("stack search result:"+ stack.get(0));

        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println("list is empty:"+list.get(2));
        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
