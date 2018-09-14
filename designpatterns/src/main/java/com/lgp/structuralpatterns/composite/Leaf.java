package com.lgp.structuralpatterns.composite;

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
}
