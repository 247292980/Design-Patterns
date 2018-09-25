package com.lgp.behavioralpatten.vistor;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 9:58
 * @DESCRIPTION
 **/
public class NodeB extends Node {
    public String operationB() {
        return "nodeb!";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visor(this);
    }
}
