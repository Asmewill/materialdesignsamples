package com.zhouwei.md.materialdesignsamples.kotlin.bean

/**
 *
 * Created by jian.shui on 2018/10/12
 */
class Human {
    var lastName :String = "zhang"
        get() = field.toUpperCase()     //转换为大写
        set

    var no: Int = 100
        get
        set(value) {
            if (value < 10) {
                field = value
            }else{
                field = -1
            }
        }
    /***
     * 这个 Human 类的 height 把 setter 设置为私有的，外部不能直接修改，
     * 需要通过 Human 类提供的方法来修改。这里提供了 addOne 方法。
     */
    var height:Float = 145.4f
    private set

    fun addOne(x: Float) {
        height += x
    }

}