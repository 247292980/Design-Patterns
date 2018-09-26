package com.lgp.behavioralpatten.strategy;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/19 17:00
 * @DESCRIPTION 策略模式
 * context 环境，持有策略类的引用
 * strategy 策略，定义一个抽象接口
 * ConcreteStrategy 具体策略
 * <p>
 * 没什么好说的，就是java的多态
 * <p>
 * ps.
 * 看完了策略模式，觉得书中讲的真的简单，
 *
 * 但是由于之前搞过两三个月的人工智能相关的规则引擎。
 * 里面很重要的一点就是策略，策略很重要的两点就是开闭原则，可扩展性，里氏替换原则，可替代性。
 * 就是写新的策略不影响旧的策略的使用，新的策略使用的数据，进到旧的策略应该不报错
 * 简单点数开闭原则，不修改其他策略对象的依赖，里氏替换原则，入参出参和老的模式一致
 * <p>
 * ps2.
 * 人工智能的第一步！
 * 人可以通过配置修改策略，甚至选择什么策略！
 * <p>
 * 当时看了下，网上很多人工智能其实真的很垃圾，顶天能做到策略模式就已经很好了，所谓的算法，也就是策略模式之中的一个策略,而国内主要还是在做这一个
 * 所以，大家不要觉得人工智能很难，大学教人工智能的那批人真的很垃圾，我有个校友人工智能的毕业设计，就是画个椭圆然后动态显示各种参数
 * 当然，你们肯定觉得热更新就能实现这功能，确实。所以说现在的人工智能真的是起点低
 **/
abstract public class Strategy {
    abstract public void strategyInterface();

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy());
        context.contextInterface();
    }
}
