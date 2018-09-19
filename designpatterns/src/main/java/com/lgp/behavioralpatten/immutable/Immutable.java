package com.lgp.behavioralpatten.immutable;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/19 16:55
 * @DESCRIPTION 不变模式
 * 额例子，没有，书直接用源码说
 * <p>
 * 不变模式其实名字很明显了，模式的值不变的话，引用的变量名再怎么不同，都是一样的
 **/
public class Immutable {
    public static void main(String[] args) {
        String asd = "asd";
        String asd2 = "asd";
        String asd3 = "asd";

        System.out.println(asd == asd2);
        System.out.println(asd.equals(asd3));
    }
}
