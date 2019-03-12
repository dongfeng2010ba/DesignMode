package com.dong.bridge;

/*
* 类似于书中的手机软件抽象类
* */
public abstract class Implementor {
    private String name;

    public Implementor() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void OperationImp();
}
