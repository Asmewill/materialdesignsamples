package com.zhouwei.md.materialdesignsamples.kotlin.bean

/**
 * https://www.jianshu.com/p/cca763828f95
 * Created by jian.shui on 2018/10/12
 * 类的 constructor 关键字一般是可以省略的。
 * 如果主构造函数有注解或可见性修饰符，
 * 则 constructor 关键字不可省略，
 * 并且这些修饰符要放在 constructor 前面。
 * 类也可以声明前缀有 constructor 的次构造函数。
 * 当类有一个主构造函数，每个次构造函数需要委托给主构造函数，
 * 可以直接委托或通过别的次构造函数间接委托。
 * 委托到同一个类的另一个构造函数用 this 关键字。
 */
class Cofox constructor(name:String) {
    var url:String="http://www.cofox.com"
    var country:String="China"
    var sitename=name
    init {
        println("初始化网站名称：$name")
    }

    constructor(name:String,alexa:Int):this(name){
        println("Transsion 排名 ${alexa}")
    }

    constructor(name:String,alexa:String):this(name){
        println("Transsion 排名 ${alexa}")
    }

    fun PrintTest(){
        println("我是类的函数")
    }


}