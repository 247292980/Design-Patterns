package com.lgp.structuralpatterns.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/14 16:34
 * @DESCRIPTION 安全型的合成模式
 * component 给参与组合的对象定义接口
 * leaf 参加组合的对象，实现了component的方法
 * composite 合成，不仅实现了component的方法，还有管理其他leaf的方法
 * <p>
 * 和原始模型很像，但是一个是有对象有方法，这个则只有方法
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

    private Enumeration components() {
        return componentVector.elements();
    }

    public void add(Component component) {
        componentVector.add(component);
    }

    public void remove(Component component) {
        componentVector.remove(component);
    }


}
