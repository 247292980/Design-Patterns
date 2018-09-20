package com.lgp.behavioralpatten.observer;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/20 9:23
 * @DESCRIPTION 观察者模式，我这边倒是说监视者模式，监听者模式，大家都是用listener而不是observer
 * <p>
 * observer 抽象观察者，只定义一个方法update，java内部有实现的import java.util.Observer;
 * subject 抽象对象，定义了被观察者要做什么
 * ConcreteObserver 具体观察者，实现update
 * ConcreteSubject 具体对象，将有关状态保存，在对象改变的时候给观察者通知
 * ps.
 * 安卓的mvp模式，早期的Presenter我们都是用listener，算是java开发安卓带过去的陋习了，不过这几年安卓的完善以及自成一圈，也不会出现这种情况了。
 * view的操作，通过listener监听，update方法走http或者socket连接服务器
 * 这是安卓已经过期的思路，我只是举个例子，后面mvp模式也发展出谷歌MVP模式和非谷歌mvp模式，这里就不提了，我也只是用过非谷歌mvp模式
 * （这里我说的话绝对过期，安卓的大佬不要当真
 * <p>
 * 变种1
 * 把向量往上提到subject，subject改成抽象类。具体的对象只负责状态的操作不负责观察者管理，观察者根据状态update执行相应操作
 * 越看越像当年的安卓开发，对view的监听状态是操作码，对服务器返回的监听的状态是返回码...当年的老大是按这本书来设计的吧？
 * <p>
 * 想想这种代码，现在随随便便就能反编译啊
 * <p>
 * ps2.
 * 观察者模式java内部就有实现，已变种二的形式 observerable类和observer类...
 * ps3.
 * 后面有几章就是说开发java awt gui的，果然当初的安卓开发框架基本就是照搬这几章的思路，好东西永远不会过时啊
 * 例子很好，建议这里看一下书
 * 定时器本质上是一个轮询的监听器啊
 * 当年的书还顺道告诉你怎么hack网站，，，开拓道路的人必定在法律的边缘吗？
 * 例子很好，建议这里看一下书*2
 **/
public interface Observer {
    void update();

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.attach(observer);
        subject.notifyObserver();
    }
}
