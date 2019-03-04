package com.dong.factorymethod;

public class FactoryA implements IFactory {
    IProduct product;
    FactoryA(){
        this.product = new ProductA();
    }
    @Override
    public IProduct creatProduct() {
        System.out.println("生产一个产品A");
        return product;
    }
}
