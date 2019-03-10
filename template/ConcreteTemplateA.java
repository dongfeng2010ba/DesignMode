package com.dong.template;

public class ConcreteTemplateA extends AbstractTemplate {
    @Override
    public void operation1() {
        System.out.println("A实现的第一题答案");
    }

    @Override
    public void operation2() {
        System.out.println("A实现的第二题答案");

    }
}
