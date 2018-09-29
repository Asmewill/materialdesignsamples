package george.curious.transsion.lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;

import george.curious.transsion.lib.bean.MArrayList;
import george.curious.transsion.lib.bean.MList;

public class MainClass {

    public static void main(String[] args) {
        /****
         * // 1.这样你就只能调用List接口里面定义好的方法，而不能使用你自己在ArrayList扩展的方法。
         *   List list = new ArrayList();
         * // 2.这样你可以使用自己在ArrayList类上扩展的方法
         * ArrayList list = new ArrayList();// 接口就是定义了一些行为，它要求你应该做什么。
         * // 假如你采用了面向接口编程方式，也就是第一种方式：List list = new ArrayList();
         ---------------------

         */
        /**
         * collection
         */
        /***
         *List
         */
        List<String> stringList = new ArrayList<>();
        List<String> vector=new Vector<>();
        List<String> linkList=new LinkedList<>();
        List<String> stack=new Stack();

        /***
         *Set
         */
        HashSet<String> hashSet=new HashSet();
        TreeSet<String> treeSet=new TreeSet<>();
        LinkedHashSet<String>  linkedHashSet=new LinkedHashSet();
        /***
         * map
         */
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> map1 = new WeakHashMap<>();
        Map<String,Object> map2=new LinkedHashMap<>();
        Map<String,Object> map3=new TreeMap<>();
        Map<String,Object> hashtable=new Hashtable<>();
        /****
         * 面向接口编程的方式，也是一种多态 MList
         */
        MList mList=new MArrayList();
        //mList.name;失效
       // mList.num;失效


    }

}
