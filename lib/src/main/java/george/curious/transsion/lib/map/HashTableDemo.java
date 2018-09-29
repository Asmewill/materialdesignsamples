package george.curious.transsion.lib.map;

import java.util.Hashtable;

/**
 * Created by jian.shui on 2018/9/28
 */
public class HashTableDemo {

    public static void main(String[] args){
        testHashtable();


    }

    private static void testHashtable() {
        /***
         * 线程同步的，同时key，value都不可以为null
         */
        Hashtable<String,Object> hashtable = new Hashtable();
        hashtable.put("baidu","101");
        hashtable.put("ali","102");
        hashtable.put("tencent","103");
        hashtable.put("wanda","105");
        hashtable.put("pingan","107");
        hashtable.put("hengda","106");
        hashtable.put("transsion","104");
        // hashtable.put(null,"2");//java.lang.NullPointerException
        //  hashtable.put("wanke",null);//java.lang.NullPointerException
        System.out.println(hashtable.toString());
        for(String key:hashtable.keySet()){
            System.out.println(key+"="+hashtable.get(key));
        }
    }
}
