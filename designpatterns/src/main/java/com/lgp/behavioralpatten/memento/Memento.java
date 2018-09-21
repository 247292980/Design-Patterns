package com.lgp.behavioralpatten.memento;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/21 14:20
 * @DESCRIPTION
 **/
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
