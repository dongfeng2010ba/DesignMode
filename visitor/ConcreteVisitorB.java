package com.dong.visitor;

public class ConcreteVisitorB extends Visitor {
    @Override
    public void visitorConCreteEleA(ConcreteEleA A) {
        System.out.println("ConcreteEleA(男人)被状态B(成功)访问");
    }

    @Override
    public void visitorConCreteEleB(ConcreteEleB B) {
        System.out.println("ConcreteEleA(女人)被状态B(成功)访问");
    }
}
