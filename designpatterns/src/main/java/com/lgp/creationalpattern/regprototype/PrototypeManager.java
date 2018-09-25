package com.lgp.creationalpattern.regprototype;

import java.util.Vector;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 14:50
 * @DESCRIPTION
 **/
public class PrototypeManager {
    public Vector objects = new Vector();

    public void add(Prototype object) {
        objects.add(object);
    }

    public Prototype get(int i) {
        return (Prototype) objects.get(i);
    }

    public int getSize() {
        return objects.size();
    }

}
