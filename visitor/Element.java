package com.dong.visitor;
/*
* 类似于书中抽象的Person类，接收状态
* */
public abstract class Element {
    public abstract void accpet(Visitor visitor);

}
