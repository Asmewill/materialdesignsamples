package com.zhouwei.md.materialdesignsamples.kotlin.bean

/**
 * Created by jian.shui on 2018/10/12
 * //类的 constructor 关键字一般是可以省略的。
 * 如果主构造函数有注解或可见性修饰符，则 constructor 关键字不可省略，并且这些修饰符要放在 constructor 前面
 */
class Pp (firstName: String) {
    init {
        println("First Name is $firstName")
    }
}