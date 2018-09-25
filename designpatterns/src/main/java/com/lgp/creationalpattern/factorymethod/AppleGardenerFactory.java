package com.lgp.creationalpattern.factorymethod;

import com.lgp.creationalpattern.factorymethod.damain.Apple;
import com.lgp.creationalpattern.factorymethod.impl.Fruit;

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
