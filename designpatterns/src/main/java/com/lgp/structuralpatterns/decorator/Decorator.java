package com.lgp.structuralpatterns.decorator;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/18 11:13
 * @DESCRIPTION 装饰器模式
 * component 给参与的对象定义接口
 * concreteComponent 参加的对象，定义一个将要接受附加责任的类
 * Decorator 装饰器，持有一个component的实例，并定义一个和接口一致的方法
 * concreteDecorator 具体装饰器，负责给对象贴上附加的责任
 * <p>
 * 作者有一句话，他把装饰器模式称作 包裹器模式，我看到之后，作者这句话真的很形象。
 * <p>
 * 装饰器的使用情况
 * 需要扩展一个类，或给一个类加附加的责任
 * 动态地对一个对象加功能，并可动态的撤销
 * 需要一些基本功能能的排列组合而产生大量的工能，
 * <p>
 * ps.
 * 其实就是把通用功能抽象出来，而且这些功能必须是大量被特定对象使用的，好像开发没遇到这种情况啊...
 * 当然框架里面有各种各样的base接口，现在想想应该就是装饰器模式了。
 * <p>
 * ps2.
 * 装饰器通过换装饰来保持核心的不变，策略则通过换策略使得核心改变。
 **/
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public Decorator() {
    }

    @Override
    public void sampleOperation() {
        component.sampleOperation();
    }

    public static void main(String[] args) {
        /*动态注册*/
        Decorator decorator = new Decorator(new ConcreteComponent());
        decorator.sampleOperation();
        ConcreteDecorator concreteDecorator = new ConcreteDecorator();
        concreteDecorator.sampleOperation();
    }
}
