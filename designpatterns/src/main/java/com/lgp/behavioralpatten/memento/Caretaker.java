package com.lgp.behavioralpatten.memento;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/21 14:27
 * @DESCRIPTION
 **/
public class Caretaker {
    private Memento memento;

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento retrieveMemento() {
        return this.memento;
    }
}
