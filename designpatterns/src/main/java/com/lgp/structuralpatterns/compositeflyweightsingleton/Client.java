package com.lgp.structuralpatterns.compositeflyweightsingleton;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/19 10:18
 * @DESCRIPTION 单例的复合亨元模式
 * Flyweight 给参与的对象定义接口，用状态state的操作必须实现
 * concreteFlyweight 具体的亨元对象，用状态state的操作，必须确保与周围环境无关，也就是不改变值，仅用于判断
 * FlyweightFactorySingleton 亨元工厂单例，管理创建亨元
 * Client 维护亨元的状态，使用亨元对象的对象
 * <p>
 * 当你理解不能的时候，就写代码吧，写了四个差不多的代码之后，感觉我懂了亨元模式
 * <p>
 * 本质上就是map的存储管理，根据复合亨元的char型做key可以看出可能就是大类拆小类，用小类保存？
 * 那么有个什么用啊？？？
 * 感觉和一些命令 如 nginx -t  这些-t的运行args的实现有点类似，可是我没看过这方面的源码，求大神解答？
 * <p>
 * ps.
 * 亨元模式书上有两个例子 coffee，看完了之后，我一脸懵逼，为什么要用亨元模式？
 * 然后下一章说 亨元模式的使用条件
 * 1.有大量的对象
 * 2.这些对象不停的新建
 * 3.这些对象大部分固定不变
 * 4.这些对象可以有很多个分组
 * 5.系统不依赖这些对象，也就是要有个default
 * <p>
 * emmmm，一个饮料表格，有多个属性 可以根据 冷热字段，酸甜字段，地区字段，颜色字段来分组。。。
 * 我们只需要运行时从数据库取数据创建一个单例，使用时实例化即可....
 * 或者使用时先取单例，单里没有取数据库，数据库没有用default什么的....
 * emmm，亨元模式或许要先在高并发，分布式的环境下是绝对用不上的吧？？？？
 * <p>
 * ps2.
 * 蛋疼的是看完了。理解了亨元模式之后，02年的书的作者很贴心的说一句，亨元模式不是一个常见的模式哦亲。我真的日狗了...
 * <p>
 * 个人感觉 亨元模式的核心就是状态，也就是代码里的state，，，简单点说就是map的key所以...
 * 我又想起了switch...
 **/
public class Client {
    private static FlyweightFactorySingleton factory;

    public static void main(String[] args) {
        factory = FlyweightFactorySingleton.getInstance();
        Flyweight flyweight = factory.factory("asd");

        flyweight.operation("third");

        factory.checkFlyweight();
    }
}
