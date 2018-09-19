package com.lgp.structuralpatterns.compositeflyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/19 9:27
 * @DESCRIPTION
 **/
public class ConcreteCompositeFlyweight extends Flyweight {
    private HashMap files = new HashMap();
    private Flyweight flyweight;

    public ConcreteCompositeFlyweight() {

    }

    public void add(Character key, Flyweight fly) {
        files.put(key, fly);
    }

    @Override
    public void operation(String state) {
        Flyweight fly = null;
        int i = 0;
        System.out.println("-------------check");
        for (Iterator iterator = files.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("Item " + (++i) + ": key=" + entry.getKey());
            fly = (Flyweight) entry.getValue();
            fly.operation(state);
        }
        System.out.println("-------------check");
    }
}

