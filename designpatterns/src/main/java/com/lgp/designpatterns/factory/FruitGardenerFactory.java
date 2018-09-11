package com.lgp.designpatterns.factory;

import com.lgp.designpatterns.factory.impl.Fruit;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/11 15:16
 * @DESCRIPTION 工厂模式-所有工厂的父类
 * <p>
 * 和简单工厂的区别就是多了一类
 * <p>
 * 工厂接口类    抽象生产者
 * 工厂类        具体生产者
 * 实体类        具体产品
 * 实体接口类    抽象产品
 * <p>
 * 使用的时候不需要写switch了！
 * <p>
 * ps.这个时候是不是觉得这个模式很傻很天真？基本没用？
 * 其实提示已经给了你了，当年的switch不支持string，那些老司机都是if elsd那样写简单共厂模式，
 * 实现我那样写的功能，if else可要多绕一步后者两三步
 * <p>
 * 那么，既然都要多一步了，为什么不在设计模式里面加一步呢？
 * 于是这个工厂模式就出现了！
 * <p>
 * ps2.这里有一个变种，利用接口多实现原理，去掉工厂类，具体产品实现抽象生产者接口，抽象产品接口，代码更加美观！！
 * 逻辑就是不太好理解就是了
 **/
public interface FruitGardenerFactory {
    public Fruit factory();

    public static void main(String[] args) {
        FruitGardenerFactory fruitGardenerFactory = new GrapeGardenerFactory();
        fruitGardenerFactory.factory().plant();
    }
}
