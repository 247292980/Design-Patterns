package com.lgp.structuralpatterns.propertiesadapter;


/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 15:29
 * @DESCRIPTION 对象的适配器模式
 * 就是继承类变成内部的一个成员对象，这种模式更加的符合适配器的使用，
 * 因为老的文件adaptee的方法名不一定和target的方法名一致
 **/
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
        adaptee.hi();
    }

    @Override
    public void sampleOperation2() {
        System.out.println(2);
    }
}
