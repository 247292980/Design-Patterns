package com.lgp.behavioralpatten.mediator;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 14:19
 * @DESCRIPTION
 **/
public class Colleague2 extends Colleague {

    public Colleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("Colleague2");
    }
}
