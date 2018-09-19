package com.lgp.structuralpatterns.flyweightsingleton;


/**
 * @AUTHOR lgp
 * @DATE 2018/9/19 10:18
 * @DESCRIPTION 单例亨元模式
 * Flyweight 给参与的对象定义接口，用状态state的操作必须实现
 * concreteFlyweight 具体的亨元对象，用状态state的操作，必须确保与周围环境无关，也就是不改变值，仅用于判断
 * FlyweightFactorySingleton 亨元工厂单例，管理创建亨元
 * Client 维护亨元的状态，使用亨元对象的对象
 * <p>
 * 终于知道client是什么鬼了，就是一个使用亨元对象的对象，，，
 **/
public class Client {
    private static FlyweightFactorySingleton factory;

    public static void main(String[] args) {
        factory = FlyweightFactorySingleton.getInstance();
        Flyweight flyweight = factory.factory(new Character('a'));
        flyweight.operation("first");
        flyweight = factory.factory(new Character('b'));
        flyweight.operation("second");
        flyweight = factory.factory(new Character('a'));
        flyweight.operation("third");

        factory.checkFlyweight();
    }
}
