package com.lgp.creationalpattern.abstractfactory;

import com.lgp.creationalpattern.abstractfactory.damain.NorthernFruit;
import com.lgp.creationalpattern.abstractfactory.damain.NorthernVeggie;
import com.lgp.creationalpattern.abstractfactory.impl.Fruit;
import com.lgp.creationalpattern.abstractfactory.impl.Veggie;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/11 17:19
 * @DESCRIPTION
 **/
public class NothernGardenerFactory implements GardenerFactory {
    @Override
    public Fruit createFruit(String name) {
        return new NorthernFruit(name);
    }
    @Override
    public Veggie createVeggie(String name){
        return new NorthernVeggie(name);
    }

}
