package com.zhouwei.md.materialdesignsamples.kotlin.bean

import com.zhouwei.md.materialdesignsamples.kotlin.base.Person2

/**
 * Created by jian.shui on 2018/10/15
 * 子类没有主构造函数时，
 * 必须在每一个二级构造函数中用 super 关键字初始化基类
 * 或者在代理另一个构造函数。
 * 初始化基类时，可以调用基类的不同构造方法。
 *
 */
class Student2: Person2 {
    constructor(name:String,age:Int,no:String,core:Int):super(name,age){
        println("-----------子类次级构造函数-------------")
        println("学生姓名：${name}")
        println("年龄：${age}")
        println("学号：${no}")
        println("成绩：${core}")

    }

}