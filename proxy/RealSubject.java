package com.dong.proxy;

public class RealSubject implements Subject{
    private String name;

    public RealSubject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void request() {
        System.out.println(getName()+"是真正幕后，我想去给关晓彤");
    }
}
