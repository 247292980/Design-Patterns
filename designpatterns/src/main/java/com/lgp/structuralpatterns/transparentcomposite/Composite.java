package com.lgp.structuralpatterns.transparentcomposite;


import java.util.Enumeration;
import java.util.Vector;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 16:34
 * @DESCRIPTION 透明的合成模式
 * component 给参与组合的对象定义接口，透明的包括管理的方法接口
 * leaf 参加组合的对象，实现了component的方法
 * composite 合成，实现了component的方法
 * <p>
 * 注意。leaf实现的管理方法应该是空的，平庸实现，也就是什么都不做。
 **/
public class Composite implements Component {
    private Vector componentVector = new Vector();

    @Override
    public Composite getComposite() {
        return this;
    }

    @Override
    public void operation() {
        Enumeration enumeration = components();
        while (enumeration.hasMoreElements()) {
            ((Component) enumeration.nextElement()).operation();
        }
    }

    @Override
    public Enumeration components() {
        return componentVector.elements();
    }

    @Override
    public void add(Component component) {
        componentVector.add(component);
    }

    @Override
    public void remove(Component component) {
        componentVector.remove(component);
    }


}
