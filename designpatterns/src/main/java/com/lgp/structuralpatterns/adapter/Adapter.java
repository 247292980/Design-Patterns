package com.lgp.structuralpatterns.adapter;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 15:29
 * @DESCRIPTION 类的适配器模式
 * <p>
 * Target 目标，所期待要得到的接口
 * Adaptee 源，目前已有的接口
 * Adapter 适配器，实现目标接口的类
 * <p>
 * 其实就是，adaptee 老文件 ，Adapter 新文件，迭代开发很常见了
 **/
public class Adapter extends Adaptee implements Target {


    @Override
    public void sampleOperation2() {
        System.out.println(2);
    }
}
