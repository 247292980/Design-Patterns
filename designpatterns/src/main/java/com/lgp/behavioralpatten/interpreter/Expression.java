package com.lgp.behavioralpatten.interpreter;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 11:05
 * @DESCRIPTION
 **/
abstract public class Expression {
    abstract public boolean interpret(Context context);

    abstract public boolean equals(Object o);

    abstract public int hasCode();

    abstract public String toString();
}
