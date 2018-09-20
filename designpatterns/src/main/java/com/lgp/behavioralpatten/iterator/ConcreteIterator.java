package com.lgp.behavioralpatten.iterator;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/20 15:04
 * @DESCRIPTION
 **/
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int index = 0;
    private int size = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.aggregate = concreteAggregate;
        size = aggregate.size();
        index = 0;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < size) {
            index++;
        }
    }

    @Override
    public boolean isDone() {
        return (index>=size);
    }

    @Override
    public Object currentItem() {
        return aggregate.getElement(index);
    }
}
