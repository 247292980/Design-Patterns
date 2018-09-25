package com.lgp.behavioralpatten.interpreter;

import java.util.HashMap;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 11:06
 * @DESCRIPTION
 **/
public class Context {

    private HashMap map = new HashMap();

    public void assign(Variable var, boolean value) {
        map.put(var, new Boolean(value));
    }

    public boolean lookup(Variable variable) {
        Boolean value = (Boolean) map.get(variable);
        if (null == value) {
            throw new IllegalArgumentException();
        }
        return value.booleanValue();
    }

}
