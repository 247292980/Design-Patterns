package com.lgp.designpatterns.abstractfactory.damain;

import com.lgp.designpatterns.abstractfactory.impl.Veggie;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/11 17:25
 * @DESCRIPTION
 **/
public class TropicalVeggie implements Veggie {
    private String name;

    public TropicalVeggie(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
