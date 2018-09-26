package com.lgp.creationalpattern.multition;

import java.util.Date;
import java.util.Random;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/12 17:46
 * @DESCRIPTION 多例模式
 * 普通多例模式 定义实体，有数量限制
 **/
public class DieMultiton {
    private static DieMultiton one = new DieMultiton();
    private static DieMultiton two = new DieMultiton();

    private DieMultiton() {
    }

    public static DieMultiton getInstance(int which) {
        if (which == 1) {
            return one;
        }
        return two;
    }

    synchronized public int dice() {
        Date now = new Date();
        Random random = new Random(now.getTime());

        int value = random.nextInt();
        value = Math.abs(value);
        value = value % 6;
        value += 1;
        return value;
    }

    public static void main(String[] args) {
        DieMultiton one = DieMultiton.getInstance(1);
        DieMultiton two = DieMultiton.getInstance(2);
        System.out.println(one.dice());
        System.out.println(two.dice());
    }
}
