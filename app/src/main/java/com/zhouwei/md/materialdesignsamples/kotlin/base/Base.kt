package com.zhouwei.md.materialdesignsamples.kotlin.base

/**
 * Created by jian.shui on 2018/10/12
 * Kotlin 默认类都是 final 的。如果类需要被其他类继承，
 * 那么要让这个类 open 才行。
 * 当 fun 是 open 的时候，那么也是可以被 override 的。
 */
open class Base {
  open  fun  f(){}
}