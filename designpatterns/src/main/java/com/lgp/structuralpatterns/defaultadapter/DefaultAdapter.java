package com.lgp.structuralpatterns.defaultadapter;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 16:15
 * @DESCRIPTION 默认适配器模式
 * 其实就是写个实现了所有接口方法的适配器，然后子类覆盖某些方法
 * <p>
 * 具体区别是
 * 类的适配器模式，本来只有老文件，后来为了增加功能，才有target接口和adapter类，本质上是一种迭代
 * 但是，他的变种属性的适配器模式变成了一开始三个文件都写进代码里的，但是这样不好增加新的方法，不太灵活
 * 然后为了更好的增加新的功能就有了默认适配器模式，通过新建子类来增加
 **/
public class DefaultAdapter implements Target {
    @Override
    public void sampleOperation1() {

    }

    @Override
    public int sampleOperation2() {
        return 0;
    }

    @Override
    public String sampleOperation3() {
        return null;
    }
}
