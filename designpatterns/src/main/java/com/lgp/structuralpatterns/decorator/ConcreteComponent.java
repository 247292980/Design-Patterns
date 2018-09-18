package com.lgp.structuralpatterns.decorator;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/18 11:16
 * @DESCRIPTION
 **/
public class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("hi");
    }

    @Override
    public void sampleOperation() {
        System.out.println(ConcreteComponent.class + " hi");
    }
}
