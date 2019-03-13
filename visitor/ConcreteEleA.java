package com.dong.visitor;
/*
* 类似书中的男人类
* */
public class ConcreteEleA extends Element {
    @Override
    public void accpet(Visitor visitor) {
        visitor.visitorConCreteEleA(this);
    }
}
