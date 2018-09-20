package com.lgp.behavioralpatten.iterator;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/20 17:13
 * @DESCRIPTION
 **/
public class Client {
    private Iterator iterator;
    private Aggregate aggregate = new ConcreteAggregate();

    public void operation() {
        iterator = aggregate.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem().toString());
            iterator.next();
        }
    }

}
