package com.lgp.designpatterns.regprototype;


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
    synchronized public Object clone() {
        Prototype temp = null;
        try {
            System.out.println("clone11");
            temp = (Prototype) super.clone();
            return temp;
        } catch (Exception e) {
            System.out.println("clone  failed");
        } finally {
            System.out.println("clone22");
            return temp;
        }
    }
}
