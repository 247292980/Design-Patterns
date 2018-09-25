package com.lgp.creationalpattern.simplefactory.damain;

import com.lgp.creationalpattern.simplefactory.impl.Fruit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/11 15:11
 * @DESCRIPTION
 **/
public class Grape implements Fruit {

    private static final Logger log = LoggerFactory.getLogger(Grape.class);
    private boolean seedLess;

    @Override
    public void grow() {
        log.info("Grape is growing");

    }

    @Override
    public void harvest() {
        log.info("Grape has been harvested");
    }

    @Override
    public void plant() {
        log.info("Grape has been planted");
    }

    public boolean isSeedLess() {
        return seedLess;
    }

    public void setSeedLess(boolean seedLess) {
        this.seedLess = seedLess;
    }
}
