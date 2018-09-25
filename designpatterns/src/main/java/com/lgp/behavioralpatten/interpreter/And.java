package com.lgp.behavioralpatten.interpreter;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 11:15
 * @DESCRIPTION
 **/
public class And extends Expression {
    private Expression left, right;

    public And(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Context context) {
        return left.interpret(context) && right.interpret(context);
    }

    @Override
    public boolean equals(Object o) {
        if (null != o && o instanceof Variable) {
            return this.left.equals(((And) o).left)
                    && this.right.equals(((And) o).right);
        }
        return false;
    }

    @Override
    public int hasCode() {
        return (this.toString()).hashCode();
    }

    @Override
    public String toString() {
        return " left=" + left.toString() + " right=" + right.toString();
    }
}
