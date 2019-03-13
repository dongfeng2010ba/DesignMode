package com.dong.visitor;
/*
* 类似于书中的女人类
* */
public class ConcreteEleB extends Element {
    @Override
    public void accpet(Visitor visitor) {
        visitor.visitorConCreteEleB(this);
    }
}
