package george.curious.transsion.lib.map;

import java.util.WeakHashMap;

/**
 * Created by jian.shui on 2018/9/27
 */
public class WeakHashMapDemo {
    public static void main(String[] args) {
        testWeakHashMapDemo();


    }

    /***
     * 输出结果是：1,0
     * WeakHashMap中当key值除了map中指向该值没有其它的地方引用
     * 就会在Map自动删除该值
     */

    public static void testWeakHashMapDemo() {
        WeakHashMap<Object, Object> map = new WeakHashMap<Object, Object>();
        Object value = new Object();
        Object key = new Object();
        map.put(key, value);
        key = null;
        //当Key指定为null时
        System.out.println(map.size());
        System.gc(); //进行gc处理
        System.runFinalization();
        System.out.println(map.size());
    }


}
