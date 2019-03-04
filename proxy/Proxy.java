package com.dong.proxy;

public class Proxy implements Subject {
    private String name;
    private Subject subject;
    Proxy(Subject subject){
        name = "Daili";
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void request() {
        System.out.println("我是"+getName()+",我在帮下面的"+"送花");
        subject.request();

    }
}
