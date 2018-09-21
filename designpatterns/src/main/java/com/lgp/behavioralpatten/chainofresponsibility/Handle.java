package com.lgp.behavioralpatten.chainofresponsibility;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/20 17:58
 * @DESCRIPTION 责任链模式
 * handle 处理者 定义一个处理请求的方法，还有返回设置责任链下家的方法
 * concretehandle 具体处理者 本身的请求以及下家的请求
 * <p>
 * ps.
 * 处理者带上状态值之后配上switch可自定义执行顺序，也就是和亨元的状态值结合
 * 这里有一些链表的基础，很容易理解。
 **/
abstract public class Handle {
    public Handle getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handle successor) {
        this.successor = successor;
    }

    protected Handle successor;

    public abstract void handleRequest();

}
