package com.lgp.behavioralpatten.interpreter;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 11:15
 * @DESCRIPTION
 **/
public class Not extends Expression {
    private Expression right;

    public Not(Expression right) {
        this.right = right;
    }

    @Override
    public boolean interpret(Context context) {
        return !right.interpret(context);
    }

    @Override
    public boolean equals(Object o) {
        if (null != o && o instanceof Variable) {
            return this.right.equals(((Not) o).right);
        }
        return false;
    }

    @Override
    public int hasCode() {
        return (this.toString()).hashCode();
    }

    @Override
    public String toString() {
        return " right=" + right.toString();
    }
}
