package george.curious.transsion.lib.set;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by jian.shui on 2018/9/27
 */
public class HashSetDemo {

    public static  void main(String[] args) {
       // testHashSet();
        Calendar cal = Calendar.getInstance();
        // get start of this week in milliseconds
        cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek()+1);
        System.out.println("time:"+ cal.getTime());


    }

    private static void testHashSet() {
        /****
         * 元素不重复
         */
        Set<String> hashSet=new HashSet<>();
        hashSet.add("javabbb");
        hashSet.add("java01");
        hashSet.add("java01");
        hashSet.add("java03");
        hashSet.add("java02");
        Set<String>  hashSet1=new HashSet<>();
        hashSet1.add("java05");
        hashSet1.add("java04");
        hashSet1.add("javaaaa");
        hashSet.add(null);//可以插入null
        hashSet.add(null);
        hashSet.addAll(hashSet1);
        boolean isEmpty=hashSet.isEmpty();
        //遍历
        Iterator<String> iterator= hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
