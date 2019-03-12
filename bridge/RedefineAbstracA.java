package com.dong.bridge;
/*
*类似于A品牌的手机
* */
public class RedefineAbstracA extends Abstraction {
    public RedefineAbstracA(String name, Implementor implementor) {
        super(name, implementor);
    }

    @Override
    public void operation() {
        System.out.println("下面是"+getName()+"品牌手机中的:");
        getImplementor().OperationImp();

    }
}
