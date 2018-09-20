package com.lgp.behavioralpatten.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/20 9:24
 * @DESCRIPTION
 **/
public class ConcreteSubject implements Subject {
    private Vector observerVector = new Vector();

    @Override
    public void attach(Observer observer) {
        observerVector.addElement(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerVector.removeElement(observer);
    }

    @Override
    public void notifyObserver() {
        Enumeration enumeration = observers();
        while (enumeration.hasMoreElements()) {
            ((Observer) enumeration.nextElement()).update();
        }
    }

    private Enumeration observers() {
        return ((Vector) observerVector.clone()).elements();
    }
}
