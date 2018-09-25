package com.lgp.behavioralpatten.visitor;

/**
 * @AUTHOR lgp
 * @DATE 2018/9/25 10:04
 * @DESCRIPTION
 **/
abstract public class Node {
    abstract public void accept(Visitor visitor);

}
