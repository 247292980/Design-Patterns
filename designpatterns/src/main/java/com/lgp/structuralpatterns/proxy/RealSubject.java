package com.lgp.structuralpatterns.proxy;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/18 16:38
 * @DESCRIPTION
 **/
public class RealSubject extends Subject {
    public RealSubject() {

    }

    @Override
    public void request() {
        System.out.println("from real subject");
    }
}
