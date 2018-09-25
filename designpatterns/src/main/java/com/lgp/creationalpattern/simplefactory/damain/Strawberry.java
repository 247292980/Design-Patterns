package com.lgp.creationalpattern.simplefactory.damain;

import com.lgp.creationalpattern.simplefactory.impl.Fruit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/11 15:14
 * @DESCRIPTION
 **/
public class Strawberry implements Fruit {
    private static final Logger log = LoggerFactory.getLogger(Strawberry.class);

    @Override
    public void grow() {
        log.info("Strawberry is growing");

    }

    @Override
    public void harvest() {
        log.info("Strawberry has been harvested");

    }

    @Override
    public void plant() {
        log.info("Strawberry has been planted");

    }
}
