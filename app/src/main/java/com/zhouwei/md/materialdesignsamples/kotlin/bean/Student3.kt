package com.zhouwei.md.materialdesignsamples.kotlin.bean

import com.zhouwei.md.materialdesignsamples.kotlin.base.Person3

/**
 * Created by jian.shui on 2018/10/15
 */
class Student3: Person3() {
    override var name="cofox"
    override fun study() {
        super.study()
        println("我在读大学")
    }
}