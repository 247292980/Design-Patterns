package com.lgp.designpatterns.prototype;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 14:22
 * @DESCRIPTION
 **/
public class ConcretePrototype implements Prototype {
    /**
     *
     * */
    @Override
    public Object clone() {
        try {
            System.out.println("clone1");
            return super.clone();
        } catch (Exception e) {
            System.out.println("clone2");
            return null;
        }
    }
}
