package com.lgp.structuralpatterns.flyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/18 17:28
 * @DESCRIPTION
 **/
public class FlyweightFactory {
    private HashMap files = new HashMap();

    public FlyweightFactory() {

    }

    public Flyweight factory(Character state) {
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
