package com.lgp.creationalpattern.lazysingleton;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/12 10:11
 * @DESCRIPTION 懒汉单例 使用时创建对象
 * <p>
 * 曾经我觉得懒汉比饿汉差，因为饿汉至少为了吃东西会动，懒汉动都不动啊，然而我是错的...
 * 所以我为了不记混，叫做使用才创建单例，同理叫饿汉 加载就创建单例
 * <p>
 * ps.很多人都说饿汉比懒汉好，可以说是错的，也可以说是对的。
 * 错的原因
 * 因为他们都说是并发的情况下，然而并发的情况下用这两个的都是傻缺，应该用他们的变种并且具体问题具体分析，应该用他们的变种并且具体问题具体分析，应该用他们的变种并且具体问题具体分析，
 * <p>
 * 所以有人问并发的情况下那种好，你应该说都不好！
 * 对的原因
 * 而饿汉懒汉的性能区别是多对象少调用 用饿汉；少对象多调用用懒汉；
 * 解释下就是多对象调用时，触发了懒汉的getInstance的同步方法，性能下降所以此时饿汉更好
 * 实际上，现在的程序运行时间不断拉长，加载时创建的消耗可以忽视...从这角度讲饿汉确实是比懒汉好。
 * <p>
 * ps2.双重检查已经被人说了很多次在java一点用都没有的，然而百度第一的csdn那篇文章依然有说双重检查
 * 老铁，java与模式是02年的书啊，csdn的博客02年还没出生，是梁静茹给你的勇气写的吗？底下评论也没几个说到这问题，初次看到的人基本都被带歪了
 **/
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    synchronized public static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
// 双重检查的错误例子
//    public LazySingleton getInstance() {
//        if (null == instance) {
//            synchronized(this) {
//                if (null == instance) {
//
//                    instance = new LazySingleton();
//                }
//            }
//          //在这里初始化执行很长时间或其他线程调用的块，存在其他线程调用对象的方法，但对象并没初始化完成，获得错误代码
//          //do something
//        }
//        return instance;
//    }
}
