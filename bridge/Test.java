package com.dong.bridge;

public class Test {
    public static void main(String[] args) {
        RedefineAbstracA iphoneA = new RedefineAbstracA("小米",new ConcreteImpB());
        iphoneA.operation();

        RedefineAbstracB iphoneB = new RedefineAbstracB("三星",new ConcreteImpA());
        iphoneB.operation();
    }
}
