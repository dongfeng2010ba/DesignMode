package com.dong.factorymethod;

public class ProductA implements IProduct {
    @Override
    public void Operation() {
        System.out.println("产品A在运行");
    }
}
