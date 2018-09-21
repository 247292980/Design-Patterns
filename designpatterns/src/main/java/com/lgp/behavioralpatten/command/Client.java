package com.lgp.behavioralpatten.command;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/21 11:09
 * @DESCRIPTION 命令行模式
 * client 创建一个具体的命令对象concretecommand 并确定其接受者
 * command 声明一个所有具体的命令的抽象接口
 * concretecommand 具体命令定义一个接受者和行为之间的弱耦合，实现执行方法
 * invoker 请求者 负责调用命令对象 执行请求
 * receiver     负责具体实施和执行一个请求
 * <p>
 * 降耦
 **/
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
