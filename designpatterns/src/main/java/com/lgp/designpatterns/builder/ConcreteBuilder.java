package com.lgp.designpatterns.builder;

import com.lgp.designpatterns.builder.domain.Product;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 10:51
 * @DESCRIPTION
 **/
public class ConcreteBuilder extends Builder {
    private Product product = new Product();

    @Override
    public void buildPart1() {
        System.out.println("build 1");
    }

    @Override
    public void buildPart2() {
        System.out.println("build 2");
    }

    @Override
    public Product retrieveResult() {
        System.out.println("build end");
        return product;
    }
}
