package com.lgp.behavioralpatten.interpreter;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 11:08
 * @DESCRIPTION
 **/
public class Constant extends Expression {
    private boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret(Context context) {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (null != o && o instanceof Constant) {
            return this.value == ((Constant) o).value;
        }
        return false;
    }

    @Override
    public int hasCode() {
        return (this.toString()).hashCode();
    }

    @Override
    public String toString() {
        return new Boolean(value).toString();
    }

}
