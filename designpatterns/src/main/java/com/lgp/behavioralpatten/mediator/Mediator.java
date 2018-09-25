package com.lgp.behavioralpatten.mediator;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 14:17
 * @DESCRIPTION 调停者模式
 * Mediator 抽象的调停者 定义一个事件方法
 * ConcreteMediator 具体调停者 实现抽象调停者定义的方法
 * Colleague 抽象的同事 实现调用调停者的方法，定义获取调停者的方法，定义一个抽象行动方法
 * ConcreteColleague 具体的同事 实现 抽象的同事定义的的抽象行动方法、
 *
 * ps.
 * mediator.colleagueChanged(c1);
 * c2.change();
 * 我觉得正常应该是用第二行的调用吧。也就是同事通知调停器开始调停和调停器自己调停...
 * ps2.
 * 总感觉该书越到后面越简略，是默认读者已经成长的吗？但是我们不是通常把这些书当成工具书，缺啥翻到哪里直接开时看的吗？
 * 还有调停者模式其实就是状态更新或者状态改变执行什么方法之类的，不就是mq的消息中间件做的事吗？
 * 这一章看完的话，对mq的使用和实现更加清楚
 **/
abstract public class Mediator {
    abstract public void colleagueChanged(Colleague colleague);

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.createConcreteMediator();
        Colleague c1 = new Colleague1(mediator);
        Colleague c2 = new Colleague2(mediator);
        mediator.colleagueChanged(c1);
        c2.change();

    }
}
