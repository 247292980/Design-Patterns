package com.lgp.structuralpatterns.proxy;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/18 16:38
 * @DESCRIPTION 代理模式
 * Subject 给参与的对象定义接口
 * proxySubject 代理的对象，内部有真实的对象的引用。并有自己的操作（如数据校验
 * realSubject 真正的对象，定义了对象必须完成的操作。
 * <p>
 * 其实就是真正的对象必须完成的操作不变，代理的对象的方法可变，例如注册的数据监测之类的，或者空值不传之类的
 * 代理模式很好理解啊，因为书中有很多例子，个人觉得讲的很好
 **/
abstract public class Subject {
    abstract public void request();

    public static void main(String[] args) {

        Subject subject = new ProxySubject();
        subject.request();

    }
}
