package com.dong.visitor;
/*
* 继承Vistor类，
* 类似于书中的某个具体状态,例如：“成功”
* */
public class ConcreteVisitorA extends Visitor{

    //类似于调用男人的状态反应方法
    @Override
    public void visitorConCreteEleA(ConcreteEleA A) {
        System.out.println("ConcreteEleA(男人)被状态A(失败)访问");
    }
    //类似于调用女人的状态反应方法
    @Override
    public void visitorConCreteEleB(ConcreteEleB B) {
        System.out.println("ConcreteEleB(女人)被状态B(失败)访问");

    }
}
