package com.lgp.behavioralpatten.visitor;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 10:13
 * @DESCRIPTION 访问者模式
 * visitor 抽象访问者 声明一个或多个访问操作
 * Concretevisitor 具体访问者，实现访问接口
 * node 抽象节点 生命接受操作，并用访问者做参数
 * concretenode 具体节点 实现抽象元素所规定的的接受操作
 * ObjectStructure 结构对象，保存所有访问对象，并进行管理
 * <p>
 * 委派 是参数同一个对象，不同类的方法具体不同
 * 分派 是不同类的方法的参数一致，该方法相同，具体方法是参数的方法
 * <p>
 * 访问就是合成模式加上面两个模式*n
 **/
public class Client {
    private static ObjectStructure objectStructure;
    private static Visitor visitor;

    public static void main(String[] args) {
        objectStructure = new ObjectStructure();
        objectStructure.add(new NodeA());
        objectStructure.add(new NodeB());
        visitor = new VisitorA();
        objectStructure.action(visitor);
    }
}
