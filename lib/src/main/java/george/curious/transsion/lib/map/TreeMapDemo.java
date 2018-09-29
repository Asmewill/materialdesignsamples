package george.curious.transsion.lib.map;

import java.util.TreeMap;

/**
 * Created by jian.shui on 2018/9/28
 * https://www.jianshu.com/p/2dcff3634326
 */
public class TreeMapDemo {
    /***
     * TreeMap�ײ��Ǹ��ݺ���������ݽṹ�����ģ�
     * Ĭ���Ǹ���key����Ȼ��������֯������integer�Ĵ�С��String���ֵ����򣩡�
     * ���ԣ�TreeMapֻ�ܸ���key�������ǲ��ܸ���value������ģ�����key����������Ͳ����γ�TreeMap����
     * @param args
     */

      public  static void main(String[] args){
          naturalSort();
      }
    //��Ȼ����˳��
    public static void naturalSort(){
        //��һ�������Integer����
        System.out.println("Integer������Ȼ����");
        TreeMap<Integer,String> treeMapFirst = new TreeMap<Integer, String>();
        treeMapFirst.put(1,"jiaboyan");
        treeMapFirst.put(6,"jiaboyan");
        treeMapFirst.put(3,"jiaboyan");
        treeMapFirst.put(10,"jiaboyan");
        treeMapFirst.put(7,"jiaboyan");
        treeMapFirst.put(13,"jiaboyan");
        //treeMapFirst.put(null,"jiaboyan");java.lang.NullPointerException
        treeMapFirst.put(14,null);//��������
        System.out.println(treeMapFirst.toString());

        //�ڶ������:SortedTest����
        System.out.println("SortedTest��������һ��");
        TreeMap<SortedTest,String> treeMapSecond = new TreeMap<SortedTest, String>();
        treeMapSecond.put(new SortedTest(10),"jiaboyan");
        treeMapSecond.put(new SortedTest(1),"jiaboyan");
        treeMapSecond.put(new SortedTest(13),"jiaboyan");
        treeMapSecond.put(new SortedTest(4),"jiaboyan");
        treeMapSecond.put(new SortedTest(0),"jiaboyan");
        treeMapSecond.put(new SortedTest(9),"jiaboyan");
        System.out.println(treeMapSecond.toString());
        //Ĭ���Ǹ���key����Ȼ��������֯������integer�Ĵ�С��String���ֵ�����
        System.out.println("integer���ֵ�����������");
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

        //�Զ������ʵ��compareTo(T o)������
        public int compareTo(SortedTest sortedTest) {
            int num = this.age - sortedTest.getAge();
            //Ϊ0ʱ��������ͬ��
            if(num==0){
                return 0;
                //����0ʱ������Ĳ���С��
            }else if(num>0){
                return 1;
                //С��0ʱ������Ĳ�����
            }else{
                return -1;
            }
        }
    }

}
