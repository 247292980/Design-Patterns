package com.lgp.behavioralpatten.state;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/21 17:17
 * @DESCRIPTION
 **/
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void simpleOperation() {
        state.simpleOperation();
    }
}
