package com.lgp.behavioralpatten.command;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/21 11:11
 * @DESCRIPTION
 **/
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
