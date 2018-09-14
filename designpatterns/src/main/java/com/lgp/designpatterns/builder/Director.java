package com.lgp.designpatterns.builder;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 10:36
 * @DESCRIPTION
 **/
public class Director {
    private Builder builder;

    public void  construct(){
        builder = new ConcreteBuilder();
        builder.buildPart1();
        builder.buildPart2();
        builder.retrieveResult();
    }

    public static void main(String[] args) {
        Director director = new Director();
        director.construct();
    }
}
