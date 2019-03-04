package com.dong.factorymethod;

public class Test {
    public static void main(String[] args) {

        IFactory factory = new FactoryA();
        factory.creatProduct().Operation();

         factory = new FactoryB();
        factory.creatProduct().Operation();


    }
}
