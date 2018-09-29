package george.curious.transsion.lib.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jian.shui on 2018/9/27
 */
public class HashMapDemo {
    public static void main(String[] args){
        testHashMap();

    }
    /***
     * 其实HashMap可以通过调用Collections的静态方法Collections.synchronizedMap(Map map)进行同步
     *
    /***
     *
     * HashMap最多只允许一条记录的键为Null
     * HashMap不支持线程的同步，即任一时刻可以有多个线程同时写HashMap;可能会导致数据的不一致
     *key值输出接口是无序的，导致值也是无序的
     *
     * key1
     key2
     key0
     key5
     key6
     key3
     key4
     key9
     key7
     key8
     */
    private static void testHashMap() {
        /***
         * hashmap的key和value都可以为null
         */
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i <= 3; i++) {
            map.put("key" + i, "value" + i);
        }
        map.put(null,"value4");
        map.put(null,"value5");
        map.put("key6",null);
        map.put("key7",null);
        map.get("key" + 5);
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
