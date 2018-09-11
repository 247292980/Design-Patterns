package com.lgp.designpatterns.factory;

import com.lgp.designpatterns.factory.damain.Strawberry;
import com.lgp.designpatterns.factory.impl.Fruit;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/11 16:08
 * @DESCRIPTION
 **/
public class StrawberryGardenerFactory implements FruitGardenerFactory{
    @Override
    public Fruit factory() {
        return new Strawberry();
    }
}
