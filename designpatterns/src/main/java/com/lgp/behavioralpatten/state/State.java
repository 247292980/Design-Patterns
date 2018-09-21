package com.lgp.behavioralpatten.state;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/21 17:18
 * @DESCRIPTION 状态模式
 * state 状态 用于封装对象一个特定状态的行为
 * ConcreteState 具体状态，实特定行为的方法
 * context 环境 ，提供设置状态的方法和调用相关状态的特定行为
 * <p>
 * 例子真心易懂，用户登录，管理员登录等等，我相信是个开发都做过管理系统吧，简直是一看例子名字就知道这模式的使用啊
 **/
public interface State {
    public void simpleOperation();

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteState());
        context.simpleOperation();
    }
}
