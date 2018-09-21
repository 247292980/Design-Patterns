package com.lgp.behavioralpatten.memento;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/21 14:29
 * @DESCRIPTION 备忘录模式
 * Originator 发起人，创建一个含有当前状态的备忘录角色
 * Memento 备忘录，将发起人的状态保存
 * caretaker 保存备忘录的角色
 * <p>
 * 不知道这玩意的意义在哪，然后看了书上的例子，双重接口，对象不暴露，数据的回滚什么的。。。
 * 回到首页？然后想想，真的挺感谢当年写过安卓，因为现在回想起来全是知识点...
 * 一个framelayout，里面显示什么view放到一个类里，然后按照这个类回退或者返回主页面什么的，妥妥备忘录模式啊！
 * <p>
 * ps.
 * 这几年n多app返回键直接退出app可以看出培训出来的水准还不如当初吃螃蟹的那批人啊
 * ps2.
 * 例子里面改一下，就是我说的安卓的view的保存...真神书也！
 **/
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("on");
        caretaker.saveMemento(originator.createMemento());
        originator.setState("off");
        originator.restoreMemento(caretaker.retrieveMemento());
    }
}
