package com.lgp.designpatterns.eagersingleton;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/12 10:04
 * @DESCRIPTION 饿汉单例 加载时就创建
 * 饿汉这名字真的不知道谁取的，我是倾向于叫他 加载就创建单例，或者叫普通单例
 * 设计模式这些坑就在于，明明已经没有人用，依然有人问这些问题，意义不明啊
 **/
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
