package com.dong.template;

public abstract class AbstractTemplate {
    public abstract void operation1();

    public abstract void operation2();

    public void templateMethod(){
        operation1();
        operation2();
    }
}
