package com.lgp.structuralpatterns.transparentcomposite;


import java.util.Enumeration;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 16:40
 * @DESCRIPTION
 **/
public class Leaf implements  Component {
    @Override
    public Composite getComposite() {
        return null;
    }

    @Override
    public void operation() {

    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Enumeration components() {
        return null;
    }
}
