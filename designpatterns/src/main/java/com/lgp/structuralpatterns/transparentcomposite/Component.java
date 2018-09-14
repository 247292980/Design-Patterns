package com.lgp.structuralpatterns.transparentcomposite;


import java.util.Enumeration;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 16:33
 * @DESCRIPTION
 **/
public interface Component {
    Composite getComposite();

    void operation();

    void add(Component component);

    void remove(Component component);

    Enumeration components();
}
