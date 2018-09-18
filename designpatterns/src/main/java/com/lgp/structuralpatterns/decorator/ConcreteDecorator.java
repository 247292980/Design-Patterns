package com.lgp.structuralpatterns.decorator;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/18 11:19
 * @DESCRIPTION
 **/
public class ConcreteDecorator extends Decorator {

    @Override
    public void sampleOperation() {
        System.out.println("ConcreteDecorator doing");
    }
}
