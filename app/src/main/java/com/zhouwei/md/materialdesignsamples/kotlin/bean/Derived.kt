package com.zhouwei.md.materialdesignsamples.kotlin.bean

import com.zhouwei.md.materialdesignsamples.kotlin.base.Base

/**
 * Created by jian.shui on 2018/10/15
 * 由于 Base 类是 open 的，所以 Derived 可以继承 Base 。
由于 f() 是 open 的，所以可以被 override
 */
abstract class Derived : Base() {
    override abstract fun f()

}