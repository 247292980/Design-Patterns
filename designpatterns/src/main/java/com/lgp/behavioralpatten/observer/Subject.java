package com.lgp.behavioralpatten.observer;


/**
 * @AUTHOR lgp
 * @DATE 2018/9/20 9:21
 * @DESCRIPTION
 **/
public interface Subject {
    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notifyObserver();

}
