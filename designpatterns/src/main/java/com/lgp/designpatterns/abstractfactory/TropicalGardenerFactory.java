package com.lgp.designpatterns.abstractfactory;

import com.lgp.designpatterns.abstractfactory.damain.TropicalFruit;
import com.lgp.designpatterns.abstractfactory.damain.TropicalVeggie;
import com.lgp.designpatterns.abstractfactory.impl.Fruit;
import com.lgp.designpatterns.abstractfactory.impl.Veggie;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/11 17:23
 * @DESCRIPTION
 **/
public class TropicalGardenerFactory implements GardenerFactory {
    @Override
    public Fruit createFruit(String name) {
        return new TropicalFruit(name);
    }

    @Override
    public Veggie createVeggie(String name) {
        return new TropicalVeggie(name);
    }
}
