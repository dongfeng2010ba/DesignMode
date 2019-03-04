package com.dong.factorymethod;

public class Test {
    public static void main(String[] args) {


        //这里具体是什么Factory可以是改成客户端输入，new了就可以用
        IFactory factory = new FactoryA();
        factory.creatProduct().Operation();

         factory = new FactoryB();
        factory.creatProduct().Operation();


    }
}
