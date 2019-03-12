package com.dong.bridge;
/*
* 这个类的作用类似于书中的手机抽象类
* */
public abstract class Abstraction {
    private String name;
    //implementor类似于软件功能的接口，聚合的关系放在一起
    private Implementor implementor;

    public Abstraction() {
    }

    public Abstraction(String name) {
        this.name = name;
    }

    public Abstraction(String name, Implementor implementor) {
        this.name = name;
        this.implementor = implementor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }


    public abstract void operation();
}
