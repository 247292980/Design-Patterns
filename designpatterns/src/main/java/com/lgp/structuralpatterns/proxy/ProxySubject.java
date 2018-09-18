package com.lgp.structuralpatterns.proxy;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/18 16:39
 * @DESCRIPTION
 **/
public class ProxySubject extends Subject {
    private RealSubject realSubject;

    public ProxySubject() {

    }

    @Override
    public void request() {
        preRequest();

        if (null == realSubject) {
            realSubject = new RealSubject();
        }
        realSubject.request();
        postRequest();
    }

    private void postRequest() {
        System.out.println("post!");
    }

    private void preRequest() {
        System.out.println("pre!");
    }
}
