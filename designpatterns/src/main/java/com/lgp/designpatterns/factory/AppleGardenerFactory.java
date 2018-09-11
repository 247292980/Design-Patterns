package com.lgp.designpatterns.factory;

import com.lgp.designpatterns.factory.damain.Apple;
import com.lgp.designpatterns.factory.impl.Fruit;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/11 16:05
 * @DESCRIPTION
 **/
public class AppleGardenerFactory implements FruitGardenerFactory{
    @Override
    public Fruit factory() {
        return new Apple();
    }

}
