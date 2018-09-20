package com.lgp.behavioralpatten.iterator;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/20 14:16
 * @DESCRIPTION 迭代子模式
 * Iterator 迭代子 此抽象角色定义出遍历元素所需的接口
 * ConcreteIterator 具体迭代子 实现Iterator接口，并保持迭代过程中的游标位置
 * Aggregate 聚集，定义 创建Iterator的接口
 * ConcreteAggregate 具体聚集 返回一个具体的聚集
 * client 客户 通过聚集操作迭代子
 * <p>
 * 书中说，优点是不用遍历，因为有遍历方法已经实现了！
 * 23333写了1堆你说少一个for循环的事
 * ps.
 * 后面看了一堆例子，发现java用了迭代子模式的数据类型由于经常被我们使用，所以我们才觉得他是一个for的事
 * 但是没有实现他的数据模型可能会各种不方便吧？润物细无声型模式啊。
 **/
public interface Iterator {
    void first();

    void next();

    boolean isDone();

    Object currentItem();

    public static void main(String[] args) {
        Client client = new Client();
        client.operation();
    }
}
