package com.dong.bridge;
/*
* 类似于手机软件的一项具体功能MP3
* */
public class ConcreteImpB extends Implementor{
    @Override
    public void OperationImp() {
        System.out.println("Mp3功能正在运行");
    }
}
