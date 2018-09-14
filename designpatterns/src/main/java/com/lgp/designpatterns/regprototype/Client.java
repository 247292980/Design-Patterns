package com.lgp.designpatterns.regprototype;


/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 14:21
 * @DESCRIPTION
 **/
public class Client {
    private Prototype prototype;
    private PrototypeManager prototypeManager = new PrototypeManager();

    public void registerPrototype() {
        prototype = new ConcretePrototype();
        Prototype p = (Prototype) prototype.clone();
        prototypeManager.add(p);

        System.out.println(p.equals(prototype));
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.registerPrototype();
    }
}
