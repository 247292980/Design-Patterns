package com.lgp.creationalpattern.factorymethod;

import com.lgp.creationalpattern.factorymethod.damain.Grape;
import com.lgp.creationalpattern.factorymethod.impl.Fruit;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/11 16:06
 * @DESCRIPTION
 **/
public class GrapeGardenerFactory implements FruitGardenerFactory {
    @Override
    public Fruit factory() {
        return new Grape();
    }
}
