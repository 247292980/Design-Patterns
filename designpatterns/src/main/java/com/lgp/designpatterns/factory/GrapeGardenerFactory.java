package com.lgp.designpatterns.factory;

import com.lgp.designpatterns.factory.damain.Grape;
import com.lgp.designpatterns.factory.impl.Fruit;

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
