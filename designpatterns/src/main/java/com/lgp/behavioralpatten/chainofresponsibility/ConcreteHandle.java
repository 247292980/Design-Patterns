package com.lgp.behavioralpatten.chainofresponsibility;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/21 9:15
 * @DESCRIPTION
 **/
public class ConcreteHandle extends Handle {
    @Override
    public void handleRequest() {
        if (null != getSuccessor()) {
            System.out.println("the request from " + getSuccessor());
            getSuccessor().handleRequest();
        } else {
            System.out.println("the request is here");
        }
    }
}
