package com.lgp.creationalpattern.abstractfactory;

import com.lgp.creationalpattern.abstractfactory.damain.TropicalFruit;
import com.lgp.creationalpattern.abstractfactory.damain.TropicalVeggie;
import com.lgp.creationalpattern.abstractfactory.impl.Fruit;
import com.lgp.creationalpattern.abstractfactory.impl.Veggie;

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
