package com.dong.factorymethod;

public class ProductB implements IProduct {
    @Override
    public void Operation() {
        System.out.println("产品B在运行");
    }
}
