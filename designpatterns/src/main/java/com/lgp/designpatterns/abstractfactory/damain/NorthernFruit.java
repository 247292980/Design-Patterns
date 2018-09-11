package com.lgp.designpatterns.abstractfactory.damain;

import com.lgp.designpatterns.abstractfactory.impl.Fruit;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/11 17:25
 * @DESCRIPTION
 **/
public class NorthernFruit implements Fruit {
    private String name;

    public NorthernFruit(String name) {
        this.name = name;
        System.out.println(name);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
