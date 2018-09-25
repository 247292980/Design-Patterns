package com.lgp.behavioralpatten.interpreter;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 11:33
 * @DESCRIPTION 解释器模式
 * Expression 抽象表达式，声明方法
 * terminal expression 终结符表达式，实现抽象表达式声明的方法
 * nonterminal expression 非终结符表达式 实现抽象表达式声明的方法
 * client 客户，调用解释器模式，其实后面几章可以看出client其实就是作者写个例子出来给我们看看怎么用
 * context 环境，上下文，提供一些变量的初始值
 * <p>
 * 越到后面的模式，作者起到的作用反而只是提一下，甚至连例子都没有，和上几个模式有java源码结合说模式特点简直是天壤之别，但是这样也说明了一个事实
 * 这个模式实际使用的情况很少
 **/
public class Client {
    private static Context context;
    private static Expression expression;

    public static void main(String[] args) {

        context = new Context();

        Variable x = new Variable("x");
        Variable y = new Variable("y");

        Constant constant = new Constant(true);

        context.assign(x, false);
        context.assign(y, true);

        expression = new Or(new And(constant, x), new And(y, new Not(x)));

        System.out.println("x= " + x.interpret(context));
        System.out.println("y= " + y.interpret(context));
        System.out.println("expression= " + expression.interpret(context));
    }
}
