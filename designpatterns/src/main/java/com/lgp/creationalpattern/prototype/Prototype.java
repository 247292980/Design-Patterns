package com.lgp.creationalpattern.prototype;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 14:22
 * @DESCRIPTION 原型模式，用于对象的复制
 *
 * client 客户，具体原型的调用
 * prototype 原型，实现cloneable接口
 * concreteprototype 具体原型，被复制的对象
 *
 * 然而，我对象的复制大都自己写一个方法，后面则是直接用了工具类copier
 * 在后面spring有个cglib包，所以在我看来也是过时的...包括后面的登记原型模式
 **/
public interface Prototype extends Cloneable {
    Object clone();
}
