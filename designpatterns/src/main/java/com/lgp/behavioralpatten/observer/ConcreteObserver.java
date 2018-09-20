package com.lgp.behavioralpatten.observer;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/20 9:30
 * @DESCRIPTION
 **/
public class ConcreteObserver implements Observer {

    @Override
    public void update() {
        System.out.println("update!!");
    }
}
