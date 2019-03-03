package com.dong.decorator;

public class UpperDecorator extends Decorator{
    public UpperDecorator(Component compoment) {
        super(compoment);
    }

    @Override
    public String display(String str) {
        String display = super.display(str);
        String transform = transform(display);
        return transform;
    }

    @Override
    public String transform(String str) {
        System.out.println("正在装饰：大写");
        return str.toUpperCase();
    }
}
