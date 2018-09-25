package com.lgp.creationalpattern.prototype;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 14:21
 * @DESCRIPTION
 **/
public class Client {
    private Prototype prototype;

    public void operation(Prototype example) {
        Prototype p = (Prototype) example.clone();
        System.out.println(p.equals(example));
    }

    public static void main(String[] args) {
        Client client = new Client();
        ConcretePrototype concretePrototype = new ConcretePrototype();
        client.operation(concretePrototype);
    }
}
