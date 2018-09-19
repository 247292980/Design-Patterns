package com.lgp.structuralpatterns.bridge;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/19 11:27
 * @DESCRIPTION 桥梁模式
 * Abstraction 抽象的对象，并保存一个实现类
 * RefinedAbstraction 扩展Abstraction，改变或修正父类的操作
 * Implementor 给参与的对象定义接口
 * ConcreteImplementor 具体实现类
 * <p>
 * 就是覆盖了方法，没什么好说的
 **/
public class Abstraction {
    protected Implementor implementor = new ConcreteImplementor();

    public void operation() {
        implementor.operation();
    }

    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();
        abstraction.operation();
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction();
        refinedAbstraction.operation();
    }
}
