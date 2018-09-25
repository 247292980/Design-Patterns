package com.lgp.behavioralpatten.mediator;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 14:16
 * @DESCRIPTION
 **/
abstract public class Colleague {
    private Mediator mediator;

    abstract public void action();

    public void change() {
        /*colleague通知调停的同事应该记录下状态什么的*/
        System.out.println(this.getClass().getName());
        mediator.colleagueChanged(this);
    }

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
