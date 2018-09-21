package com.lgp.behavioralpatten.memento;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/21 14:19
 * @DESCRIPTION
 **/
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
        System.out.println("restore state=" + getState());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("state=" + getState());
    }
}
