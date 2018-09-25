package com.lgp.creationalpattern.regsingleton;

import java.util.HashMap;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/12 10:48
 * @DESCRIPTION 登记单例类，克服懒汉饿汉不能继承的缺点
 * 缺点是子类的构造方法必须是公开的，也就是存在不通过登记单例类，生成实体。
 * 另一个缺点是登记单例类必须存在才能，登记子类的单例类，这在有些情况下是种浪费
 *
 * ps.这里提一下这种的一个变种 只有父类没有子类，很多东西都登记到map里面。
 * 这种写法在早期安卓国内起步阶段，15年的广州安卓很常见，估计是哪个培训或者大神的手笔。
 * 说真的一点问题都没有，但是安卓到了后期有各种各样的内存调优问题，这类的代码就很可怕了，大家只管放进去而不管gc，无限增大
 * 而且安卓上本来就没什么资源并发的问题，这玩意他们是拿来当消息传递的，结果就是消息越来越多，现在开发安卓的看到这个模式要留心前任的坑啊
 **/
public class RegSingleton {
    private static HashMap map = new HashMap();

    static {
        RegSingleton instance = new RegSingleton();
        map.put(instance.getClass().getName(), instance);
    }

    protected RegSingleton() {
    }

    public static RegSingleton getInstance(String name) {
        if (null == name) {
            name = "com.lgp.designpatterns.regsingleton.RegSingleton";
        }

        if (null == map.get(name)) {
            try {
                map.put(name, Class.forName(name).newInstance());
            } catch (Exception e) {
                System.out.println("error");

            }
        }

        return (RegSingleton) map.get(name);
    }

    public void hi() {
        System.out.println("hi,im your father");
    }
}
