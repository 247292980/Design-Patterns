package com.lgp.structuralpatterns.bridge;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/19 11:30
 * @DESCRIPTION
 **/
public class ConcreteImplementor extends Implementor {

    @Override
    public void operation() {
        System.out.println("do something!!!");
    }
}
