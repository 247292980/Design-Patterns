package com.lgp.structuralpatterns.facade;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/19 11:12
 * @DESCRIPTION 门面模式
 * facade 门面，提供接口
 * subsystem 子系统
 * <p>
 * 举个例子
 * controller提供接口里面有用到很多个service
 **/
public class Facade {
    private static SubSystem1 one = new SubSystem1();
    private static SubSystem2 two = new SubSystem2();
    private static SubSystem3 three = new SubSystem3();

    private void working() {
        one.working();
        two.working();
        three.working();
    }

    private void working2() {
        one.working();
        two.working();
    }

    private void working1() {
        one.working();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.working();
    }
}
