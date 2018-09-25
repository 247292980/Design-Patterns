package com.lgp.behavioralpatten.visitor;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 10:00
 * @DESCRIPTION
 **/
public class VisitorA implements Visitor {
    @Override
    public void visor(NodeA nodeA) {
        System.out.println(nodeA.operationA());
    }

    @Override
    public void visor(NodeB nodeB) {
        System.out.println(nodeB.operationB());
    }
}
