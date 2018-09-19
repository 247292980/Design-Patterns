package com.lgp.structuralpatterns.compositeflyweightsingleton;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/18 17:28..
 **/
public class FlyweightFactorySingleton {
    private HashMap files = new HashMap();
    private Flyweight lnkFlyweight;
    private static FlyweightFactorySingleton myself = new FlyweightFactorySingleton();

    private FlyweightFactorySingleton() {

    }

    public static FlyweightFactorySingleton getInstance() {
        return myself;
    }

    public Flyweight factory(String compositeState) {
        ConcreteCompositeFlyweight concreteCompositeFlyweight = new ConcreteCompositeFlyweight();
        int length = compositeState.length();
        Character state = null;
        for (int i = 0; i < length; i++) {
            state = new Character(compositeState.charAt(i));
            System.out.println("factory:  " + state);
            concreteCompositeFlyweight.add(state, this.factory(state));
        }
        return concreteCompositeFlyweight;
    }

    private Flyweight factory(Character state) {
        if (files.containsKey(state)) {
            return (Flyweight) files.get(state);
        }
        Flyweight fy = new ConcreteFlyweight(state);
        files.put(state, fy);
        return fy;
    }

    public void checkFlyweight() {
        int i = 0;
        System.out.println("-------------check");
        for (Iterator iterator = files.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("Item " + (++i) + ": key=" + entry.getKey());
        }
        System.out.println("-------------check");
    }


}
