package com.lgp.behavioralpatten.iterator;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/20 14:22
 * @DESCRIPTION
 **/
public class ConcreteAggregate extends Aggregate {
    private Object[] obj = {"Monkey", "Monk", "Key"};


    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object getElement(int index) {
        if (index < obj.length) {
            return obj[index];
        }
        return null;
    }

    public int size() {
        return obj.length;
    }
}
