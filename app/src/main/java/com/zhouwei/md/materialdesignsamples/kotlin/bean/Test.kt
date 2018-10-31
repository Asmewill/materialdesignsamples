package com.zhouwei.md.materialdesignsamples.kotlin.bean

import com.zhouwei.md.materialdesignsamples.kotlin.callback.TestInterface

/**
 * Created by jian.shui on 2018/10/15
 */
class Test {
    var v="成员属性"
    fun setInterface(testInterface:TestInterface){
        testInterface.test()
    }
}