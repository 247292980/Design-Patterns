package com.lgp.designpatterns.simplefactory.damain;

import com.lgp.designpatterns.simplefactory.impl.Fruit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/11 15:07
 * @DESCRIPTION
 **/
public class Apple implements Fruit {
    public static final Logger log = LoggerFactory.getLogger(Apple.class);
    private int treeAge;

    @Override
    public void grow() {
        log.info("apple is growing");
    }

    @Override
    public void harvest() {
        log.info("apple has been harvested");
    }

    @Override
    public void plant() {
        log.info("apple has been planted");
    }

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }
}
