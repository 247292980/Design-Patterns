package com.lgp.structuralpatterns.compositeflyweight;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/19 9:25
 * @DESCRIPTION 复合的亨元模式
 * Flyweight 给参与的对象定义接口，用状态state的操作必须实现
 * concreteFlyweight 具体的亨元对象，用状态state的操作，必须确保与周围环境无关，也就是不改变值，仅用于判断
 * FlyweightFactorySingleton 亨元工厂，管理创建亨元
 * concreteCompositeFlyweight 复合亨元，本身是不可共享。由多个亨元对象组成
 * <p>
 * 亨元模式看下来，只能说我是个小白.书里面其实还有个client但是没有相应的代码
 * 平时写和看的框架源码都没有见过使用亨元的，应该水平太低我没看出来
 **/
abstract public class Flyweight {
    abstract public void operation(String state);

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory("aba");
        fly.operation("Composite");
        factory.checkFlyweight();

    }
}
