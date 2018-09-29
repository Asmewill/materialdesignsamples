package george.curious.transsion.lib.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by jian.shui on 2018/9/27
 */
public class TreeSetDemo {

    public static void main(String[] args) {
        testIntegerSort();
        testDictionarySort();
        testCompatorSort();
        testSubHeadTailSet();
    }

    private static void testIntegerSort() {
        System.out.println("Integer对象自然排序：");
        TreeSet<Integer> treeSetFirst = new TreeSet<>();
        treeSetFirst.add(2);
        treeSetFirst.add(1);
        treeSetFirst.add(4);
        treeSetFirst.add(3);
        treeSetFirst.add(5);
        Iterator<Integer> iterator=treeSetFirst.iterator();
        while (iterator.hasNext()){
                System.out.println(iterator.next());
        }
    }
    private static void testDictionarySort() {
        System.out.println("Dictionary对象自然排序：");
        TreeSet<String> treeSetFirst = new TreeSet<>();
        treeSetFirst.add("Baidu");
        treeSetFirst.add("Tecent");
        treeSetFirst.add("Ali");
        treeSetFirst.add("WanDa");
        treeSetFirst.add("HengDa");
        treeSetFirst.add("12");
        treeSetFirst.add("23a#");
        treeSetFirst.add("#");
        Iterator<String> iterator=treeSetFirst.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    private static void testCompatorSort() {
        System.out.println("Compator对象自然排序：");
        Set<Student> treeSet=new TreeSet<>();
        treeSet.add(new Student("tecent",2));
        treeSet.add(new Student("JD",1));
        treeSet.add(new Student("wanda",3));
        treeSet.add(new Student("baidu",2));
        treeSet.add(new Student("ali",2));
        treeSet.add(new Student("tecent",2));//重复的元素被剔除了
        Iterator itTSet = treeSet.iterator();//遍历输出
        while(itTSet.hasNext()){
            System.out.print(itTSet.next() + "\n");
        }
    }

    private static void testSubHeadTailSet() {
        System.out.println("SubHeadTailSet：");
        TreeSet nums = new TreeSet();
        nums.add(5);
        nums.add(2);
        nums.add(3);
        nums.add(8);
        nums.add(8);
        //输出集合元素，可以看到集合元素已经处于排序状态，输出【2，3，5，8】
        System.out.println(nums);
        //输出排序后集合里的第一个元素2
        System.out.println(nums.first());
        //输出排序后集合里最后一个元素
        System.out.println(nums.last());
        //输出小于4的集合，不包含4，输出【2，3】
        System.out.println(nums.headSet(4));
        //输出大于5的集合，如果set集合中有5，子集中还应该有5，输出【5，8】
        System.out.println(nums.tailSet(5));
        //输出大于2，小于5的子集，包括2，不包括5，输出集合【2，3】
        System.out.println(nums.subSet(2, 5));
    }
    public static class Student implements Comparable {
        int num;
        String name;

        public Student( String name,int num) {
            this.num = num;
            this.name = name;
        }

        @Override
        public String toString() {
            return "StudentNo:" + num + " ,StudentName:" + name      ;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int compareTo(Object o) {
            Student student= (Student) o;
            if(num<student.getNum()){//升序排列
                return -1;
            }else if(num==student.getNum()){
                return name.compareTo(student.getName());
            }else{
                return 1;
            }

        }
    }


}
