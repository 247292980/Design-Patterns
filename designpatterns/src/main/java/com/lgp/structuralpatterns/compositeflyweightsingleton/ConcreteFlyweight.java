package com.lgp.structuralpatterns.compositeflyweightsingleton;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/19 9:26
 * @DESCRIPTION
 **/
public class ConcreteFlyweight extends Flyweight {
    private Character intrinsicState = null;

    public ConcreteFlyweight(Character state) {
        this.intrinsicState = state;
    }

    @Override
    public void operation(String state) {
        System.out.println("intrinsicState= " + intrinsicState);
        System.out.println("state= " + state);
    }
}
