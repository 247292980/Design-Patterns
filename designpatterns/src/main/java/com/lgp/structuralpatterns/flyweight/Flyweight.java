package com.lgp.structuralpatterns.flyweight;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/18 17:20
 * @DESCRIPTION 亨元模式
 * Flyweight 给参与的对象定义接口，用状态state的操作必须实现
 * concreteFlyweight 具体的亨元对象，用状态state的操作，必须确保与周围环境无关，也就是不改变值，仅用于判断
 * FlyweightFactorySingleton 亨元工厂，管理创建亨元
 * <p>
 * 我想起了switch...
 **/
abstract public class Flyweight {
    abstract public void operation(String state);

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight = factory.factory(new Character('a'));
        flyweight.operation("first");
        flyweight = factory.factory(new Character('b'));
        flyweight.operation("second");
        flyweight = factory.factory(new Character('a'));
        flyweight.operation("third3");

        factory.checkFlyweight();
    }
}
