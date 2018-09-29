package george.curious.transsion.lib.map;

import java.util.TreeMap;

/**
 * Created by jian.shui on 2018/9/28
 * https://www.jianshu.com/p/2dcff3634326
 */
public class TreeMapDemo {
    /***
     * TreeMap底层是根据红黑树的数据结构构建的，
     * 默认是根据key的自然排序来组织（比如integer的大小，String的字典排序）。
     * 所以，TreeMap只能根据key来排序，是不能根据value来排序的（否则key来排序根本就不能形成TreeMap）。
     * @param args
     */

      public  static void main(String[] args){
          naturalSort();
      }
    //自然排序顺序：
    public static void naturalSort(){
        //第一种情况：Integer对象
        System.out.println("Integer对象自然排序：");
        TreeMap<Integer,String> treeMapFirst = new TreeMap<Integer, String>();
        treeMapFirst.put(1,"jiaboyan");
        treeMapFirst.put(6,"jiaboyan");
        treeMapFirst.put(3,"jiaboyan");
        treeMapFirst.put(10,"jiaboyan");
        treeMapFirst.put(7,"jiaboyan");
        treeMapFirst.put(13,"jiaboyan");
        //treeMapFirst.put(null,"jiaboyan");java.lang.NullPointerException
        treeMapFirst.put(14,null);//可以运行
        System.out.println(treeMapFirst.toString());

        //第二种情况:SortedTest对象
        System.out.println("SortedTest对象排序一：");
        TreeMap<SortedTest,String> treeMapSecond = new TreeMap<SortedTest, String>();
        treeMapSecond.put(new SortedTest(10),"jiaboyan");
        treeMapSecond.put(new SortedTest(1),"jiaboyan");
        treeMapSecond.put(new SortedTest(13),"jiaboyan");
        treeMapSecond.put(new SortedTest(4),"jiaboyan");
        treeMapSecond.put(new SortedTest(0),"jiaboyan");
        treeMapSecond.put(new SortedTest(9),"jiaboyan");
        System.out.println(treeMapSecond.toString());
        //默认是根据key的自然排序来组织（比如integer的大小，String的字典排序）
        System.out.println("integer和字典对象排序二：");
        TreeMap<String,SortedTest> treeMapThree = new TreeMap<String,SortedTest >();
        treeMapThree.put("2key1",new SortedTest(10));
        treeMapThree.put("1key2",new SortedTest(1));
        treeMapThree.put("bey3",new SortedTest(13));
        treeMapThree.put("key6",new SortedTest(4));
        treeMapThree.put("key5",new SortedTest(0));
        treeMapThree.put("key4",new SortedTest(9));
        System.out.println(treeMapThree.toString());
    }

    public static class SortedTest implements Comparable<SortedTest> {
        private int age;
        public SortedTest(int age){
            this.age = age;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "age:"+age;
        }

        //自定义对象，实现compareTo(T o)方法：
        public int compareTo(SortedTest sortedTest) {
            int num = this.age - sortedTest.getAge();
            //为0时候，两者相同：
            if(num==0){
                return 0;
                //大于0时，传入的参数小：
            }else if(num>0){
                return 1;
                //小于0时，传入的参数大：
            }else{
                return -1;
            }
        }
    }

}
