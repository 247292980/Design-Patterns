package com.lgp.behavioralpatten.interpreter;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 11:12
 * @DESCRIPTION
 **/
public class Variable extends Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Context context) {
        return context.lookup(this);
    }

    @Override
    public boolean equals(Object o) {
        if (null != o && o instanceof Variable) {
            return this.name.equals(((Variable) o).name);
        }
        return false;
    }

    @Override
    public int hasCode() {
        return (this.toString()).hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
