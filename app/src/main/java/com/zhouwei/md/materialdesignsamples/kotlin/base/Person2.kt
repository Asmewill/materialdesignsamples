package com.zhouwei.md.materialdesignsamples.kotlin.base

/**
 * Created by jian.shui on 2018/10/15
 */
open class Person2 (name:String){
    constructor(name:String,age:Int):this(name){
        //基类次级构造
        println("-----------基类次级构造函数-------------")
    }
}