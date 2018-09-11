package com.lgp.designpatterns.simplefactory;

import com.lgp.designpatterns.simplefactory.damain.Apple;
import com.lgp.designpatterns.simplefactory.damain.Grape;
import com.lgp.designpatterns.simplefactory.damain.Strawberry;
import com.lgp.designpatterns.simplefactory.exception.BadFruitException;
import com.lgp.designpatterns.simplefactory.impl.Fruit;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/11 15:16
 * @DESCRIPTION 简单工厂模式
 * 可以看出共产类就三个部分
 * <p>
 * 工厂类 生产者
 * 实体类 具体产品
 * 接口类 抽象产品
 * <p>
 * 伪代码
 * <p>
 * public static 抽象产品 生产者{
 * return 具体产品
 * }
 **/
@Deprecated
public class FruitGardenerFactory {

    public static void main(String[] args) {
        try {
            FruitGardenerFactory.factory("apple").grow();
            FruitGardenerFactory.factory("grape").harvest();
            FruitGardenerFactory.factory("strawberry").plant();
        } catch (BadFruitException e) {
            e.printStackTrace();
        }
    }

    public static Fruit factory(String which) throws BadFruitException {
        /*书本里面并没有使用switch，因为当时switch还不支持用string做条件*/
        switch (which.toUpperCase()) {
            case "APPLE":
                return new Apple();
            case "STRAWBERRY":
                return new Strawberry();
            case "GRAPE":
                return new Grape();
            default:
                throw new BadFruitException("bad fruit!!");
        }
    }
}
