package com.lgp.behavioralpatten.template;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/19 17:34
 * @DESCRIPTION
 **/
abstract public class AbstractTemplate {
    public void TemplateMethod() {
        doOperation1();
        doOperation2();
        doOperation3();
    }

    abstract protected void doOperation1();

    abstract protected void doOperation2();

    protected void doOperation3() {
        System.out.println(3);
    }
}
