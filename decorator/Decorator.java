package com.dong.decorator;

/*
* 字符串的装饰器抽象类
* */

public abstract  class Decorator implements Component {
    Component component;
    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public String display(String str) {
        return component.display(str);
    }

    public abstract String transform(String str);
}
