package com.dong.factorymethod;

public class FactoryB implements IFactory {
    IProduct product;
    FactoryB(){
        this.product = new ProductB();
    }
    @Override
    public IProduct creatProduct() {
        System.out.println("生产一个产品B");
        return product;
    }
}
