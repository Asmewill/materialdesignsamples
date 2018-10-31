package com.zhouwei.md.materialdesignsamples.kotlin.bean

/**
 * Created by jian.shui on 2018/10/15
 * 当把嵌套在内部的类标记为 inner 内部类时，
 * 每层的引用都需要加括号。
 * 内部类可以访问外部类成员，也可以通过 this@外部类 ，
 * 从而达到能获取外部类实例的使用模式。
 */
class Outers {
    private  val bar :Int=1
    inner class Nested{
        fun foo()=2
        inner  class Thrd{
            fun mee()="meyaya"
            fun innerTest(){
                var o=this@Outers
                var nested=Nested()
                println("这是获取外部类成员:"+o.bar.toString()+"    "+ nested.foo())


            }
        }
    }
}