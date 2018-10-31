package george.curious.transsion.lib.supers;

/**
 * Created by jian.shui on 2018/10/12
 */
public class BBB extends AAA {

    /***
     * 子类如何继承了父类的化，如果父类无无参数的构造方法，只有带有参数的构造方法，那么
     * 子类必须实现至少一个带有参数的构造方法
     * @param a
     */
    public BBB(int a) {
        super(a);
    }

//    public BBB(int b, String c) {
//        super(b, c);
//    }
}
