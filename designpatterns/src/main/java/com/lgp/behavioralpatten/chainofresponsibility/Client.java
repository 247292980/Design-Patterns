package com.lgp.behavioralpatten.chainofresponsibility;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/21 9:18
 * @DESCRIPTION
 **/
public class Client {
    private static Handle handle1, handle2;

    public static void main(String[] args) {
        handle1 = new ConcreteHandle();
        handle2 = new ConcreteHandle();
        handle1.setSuccessor(handle2);
        handle1.handleRequest();
//        handle2.handleRequest();

    }
}
