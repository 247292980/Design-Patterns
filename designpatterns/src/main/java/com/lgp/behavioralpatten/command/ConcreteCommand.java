package com.lgp.behavioralpatten.command;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/21 11:19
 * @DESCRIPTION
 **/
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
