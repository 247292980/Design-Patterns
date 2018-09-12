package com.lgp.designpatterns.regsingleton;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/12 14:05
 * @DESCRIPTION
 **/
public class RegSingletonChild extends RegSingleton {
    public RegSingletonChild() {

    }

    public static RegSingletonChild getInstance() {
        return (RegSingletonChild) RegSingleton.getInstance("com.lgp.designpatterns.regsingleton.RegSingletonChild");
    }

    @Override
    public void hi() {
        System.out.println("hi,im your son");
    }

    public static void main(String[] args) {
        RegSingletonChild.getInstance().hi();
    }
}

