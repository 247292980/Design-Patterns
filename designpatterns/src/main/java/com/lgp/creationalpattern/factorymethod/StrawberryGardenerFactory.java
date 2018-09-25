package com.lgp.creationalpattern.factorymethod;

import com.lgp.creationalpattern.factorymethod.damain.Strawberry;
import com.lgp.creationalpattern.factorymethod.impl.Fruit;

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
