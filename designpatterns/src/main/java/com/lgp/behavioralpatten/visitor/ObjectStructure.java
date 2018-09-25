package com.lgp.behavioralpatten.visitor;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 10:08
 * @DESCRIPTION
 **/
public class ObjectStructure {
    private Vector nodes;
    private Node node;

    public ObjectStructure() {
        this.nodes = new Vector();
    }

    public void action(Visitor visitor) {
        for (Enumeration e = nodes.elements(); e.hasMoreElements(); ) {
            node = (Node) e.nextElement();
            node.accept(visitor);
        }
    }

    public void add(Node node) {
        nodes.add(node);
    }


}
