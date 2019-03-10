package com.dong.state;
/*
* 状态模式适用于状态的判断转移，这样避免将将一个判断的分支写在一起，造成程序很长不好维护
* */
public class Test {
    public static void main(String[] args) {
        Context c = new Context(new ConcreteStateA());
        c.request();
        c.request();
        c.request();
        c.request();
    }
}
