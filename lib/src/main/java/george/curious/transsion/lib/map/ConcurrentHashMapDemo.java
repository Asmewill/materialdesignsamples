package george.curious.transsion.lib.map;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by jian.shui on 2018/9/29
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args){
        testConcurrentHashMap();


    }

    private static void testConcurrentHashMap() {
        /***
         * ConcurrentHashMap和HashTable都是线程安全的，可以在多线程中进行，
         * key和value都不能为null,性能上要比Hashtable要强
         * 线程同步的，同时key，value都不可以为null
         */
        ConcurrentHashMap<String,Object> concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("baidu","101");
        concurrentHashMap.put("ali","102");
        concurrentHashMap.put("tencent","103");
        concurrentHashMap.put("wanda","105");
        concurrentHashMap.put("pingan","107");
        concurrentHashMap.put("hengda","106");
        concurrentHashMap.put("transsion","104");
        // concurrentHashMap.put(null,"2");//java.lang.NullPointerException
        // concurrentHashMap.put("wanke",null);//java.lang.NullPointerException
        for(String key:concurrentHashMap.keySet()){
            System.out.println(key+"="+concurrentHashMap.get(key));
        }
    }
}
