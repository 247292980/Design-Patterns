package com.lgp.behavioralpatten.visitor;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 9:58
 * @DESCRIPTION
 **/
public class NodeA extends Node {
    public String operationA() {
        return "nodea!";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visor(this);
    }
}
