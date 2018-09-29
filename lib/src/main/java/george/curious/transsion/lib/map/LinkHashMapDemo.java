package george.curious.transsion.lib.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jian.shui on 2018/9/27
 */
public class LinkHashMapDemo {

    public static void main(String[] args) {
        testLinkHashMap();

    }

    /***
     *  key值是有序的，导致输出的结果也是有序的
     * key0
     * key1
     * key2
     * key3
     * ...
     * key9
     */
    private static void testLinkHashMap() {
        //linkedhashmap  extends hashmap 比hashmap功能更强大
        Map<String, String> map = new LinkedHashMap<>();
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
