package com.lgp.creationalpattern.abstractfactory;

import com.lgp.creationalpattern.abstractfactory.impl.Fruit;
import com.lgp.creationalpattern.abstractfactory.impl.Veggie;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/11 15:16
 * @DESCRIPTION 抽象工厂模式
 * 和工厂模式的基本一样
 * <p>
 * 工厂接口类    抽象生产者
 * 工厂类        具体生产者
 * 实体类        具体产品
 * 实体接口类    抽象产品
 * <p>
 * 区别在于，他的抽象产品有两个，也就是说这个模式支持多个类型的产品
 * 虽然书上说，不改变原有代码就能balabala，但是这个代码的缺陷是加新的工厂当然不修改原有的代码，那么如果加新的抽象产品呢？
 * 其他工厂，有些有这产品有些无呢？
 * <p>
 * ps.抽象生产者加default方法，去掉具体生产者，产品继承抽象生产者，加新的产品必须要在接口加新的default方法
 * 缺点就是一个类多了很多不必要的方法
 *
 * ps2.所以说怎么不修改原有的代码呢？好像总有这样那样的缺陷啊，其实很简单，新的具体生产多继承一个新的抽象接口...
 * 之后通过代码迭代，慢慢合并即可
 */
public interface GardenerFactory {
    Fruit createFruit(String name);

    Veggie createVeggie(String name);

    public static void main(String[] args) {
        NothernGardenerFactory nothernGardenerFactory = new NothernGardenerFactory();
        nothernGardenerFactory.createFruit("apple");
    }
}
