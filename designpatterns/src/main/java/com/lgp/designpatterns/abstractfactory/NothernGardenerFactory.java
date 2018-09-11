package com.lgp.designpatterns.abstractfactory;

import com.lgp.designpatterns.abstractfactory.damain.NorthernFruit;
import com.lgp.designpatterns.abstractfactory.damain.NorthernVeggie;
import com.lgp.designpatterns.abstractfactory.impl.Fruit;
import com.lgp.designpatterns.abstractfactory.impl.Veggie;

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
