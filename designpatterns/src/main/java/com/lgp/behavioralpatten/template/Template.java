package com.lgp.behavioralpatten.template;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/19 17:33
 * @DESCRIPTION 模板模式
 * AbstractTemplate 抽象模板 定义几个方法，或实现或让子类实现
 * ConcreteTemplate 具体模板，实现父类没事闲的方法
 * <p>
 * 日常和策略模式结合使用
 * ps.
 * 重构的原则
 * 行为向上，状态向下
 * 就是方法靠向父类，状态值具体到每个子类！
 **/
public class Template {
    public static void main(String[] args) {
        ConcreteTemplate abstractTemplate = new ConcreteTemplate();
        abstractTemplate.TemplateMethod();

    }
}
