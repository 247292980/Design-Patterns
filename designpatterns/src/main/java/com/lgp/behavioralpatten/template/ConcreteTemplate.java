package com.lgp.behavioralpatten.template;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/19 17:36
 * @DESCRIPTION
 **/
public class ConcreteTemplate extends AbstractTemplate {
    @Override
    protected void doOperation1() {
        System.out.println(1);
    }

    @Override
    protected void doOperation2() {
        System.out.println(2);
    }
}
