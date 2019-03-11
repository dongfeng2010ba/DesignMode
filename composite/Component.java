package com.dong.composite;
/*
* 相当于大话设计模式中的抽象公司
*
* */
public abstract class Component {
    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);

}
