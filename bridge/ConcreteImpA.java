package com.dong.bridge;
/*
* 类似于手机软件的具体一项功能：摄像
* */
public class ConcreteImpA extends Implementor {
    @Override
    public void OperationImp() {
        System.out.println("摄像功能正在运行");
    }
}
