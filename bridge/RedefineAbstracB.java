package com.dong.bridge;

public class RedefineAbstracB extends Abstraction {
    public RedefineAbstracB(String name, Implementor implementor) {
        super(name, implementor);
    }

    @Override
    public void operation() {
        System.out.println("下面是" + getName() + "品牌手机中的:");
        getImplementor().OperationImp();
    }
}
