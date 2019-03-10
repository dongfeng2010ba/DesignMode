package com.dong.template;

public class Test {
    public static void main(String[] args) {
        AbstractTemplate c = new ConcreteTemplateA();
        c.templateMethod();
        System.out.println("====================");
        AbstractTemplate d = new ConcreteTemplateB();
        d.templateMethod();
    }
}
