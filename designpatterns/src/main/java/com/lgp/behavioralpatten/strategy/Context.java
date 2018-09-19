package com.lgp.behavioralpatten.strategy;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/19 17:00
 * @DESCRIPTION
 **/
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.strategyInterface();
    }
}
