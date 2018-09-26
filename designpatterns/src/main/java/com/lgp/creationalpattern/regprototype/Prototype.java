package com.lgp.creationalpattern.regprototype;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 14:44
 * @DESCRIPTION 登记原型模式，还是用来复制对象？感觉这个没什么了解的必要啊...
 * <p>
 * client 客户，具体原型的调用
 * prototype 原型，实现cloneable接口
 * concreteprototype 具体原型，被复制的对象
 * prototype manager 具体原型的管理器，记录每一个被创建的对象
 * <p>
 * 23333,看了下代码，登记进去了，怎么取啊老铁？
 * 这可能是我看的java与模式的书的问题？作者出了个大bug啊
 * <p>
 * 强烈建议看一下我的CopyUtil，现在看一下我当年竟然用登记原型模式封装了cglib的工具类，，，，
 * <p>
 * ps.这里书上说了深复制和浅复制。浅复制就是clone了，深复制就是变成字节流再变回来。
 * 区分就是复制前后的对象里面的成员指向的不是同一个
 **/
public interface Prototype extends Cloneable {
    public Object clone();
}
