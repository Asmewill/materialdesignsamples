package george.curious.transsion.lib.bean;

/**
 * Created by jian.shui on 2018/9/27
 */
public class Student implements Comparable {
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
        if(num<student.num){//升序排列
            return -1;
        }else if(num==student.num){
            return name.compareTo(student.name);
        }else{
            return 1;
        }

    }
}
