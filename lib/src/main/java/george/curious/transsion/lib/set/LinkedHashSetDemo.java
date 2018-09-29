package george.curious.transsion.lib.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by jian.shui on 2018/9/29
 */
public class LinkedHashSetDemo {
    public  static void main(String[] args){
        testLinkedHashSet();

    }

    private static void testLinkedHashSet() {
        /****
         * 因为是链表，所以有序输出
         * 元素不重复
         */
        Set<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("java01");
        linkedHashSet.add("java01");
        linkedHashSet.add("java02");
        linkedHashSet.add("java03");
        Set<String> linkedHashSet1=new LinkedHashSet<>();
        linkedHashSet1.add("java04");
        linkedHashSet1.add("java05");
        linkedHashSet1.add(null);
        linkedHashSet1.add(null);
        linkedHashSet.addAll(linkedHashSet1);
        //遍历
        Iterator<String> iterator= linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
