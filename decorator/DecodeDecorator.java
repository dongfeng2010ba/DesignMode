package com.dong.decorator;

public class DecodeDecorator extends Decorator {

    public DecodeDecorator(Component component) {
        super(component);
    }

    @Override
    public String display(String str) {
        return transform(component.display(str));
    }
    @Override
    public String transform(String str) {
        System.out.println("正在装饰：解密");
        //解密装饰器的具体的装饰过程，用解密算法复写，当然也可以是其他的形式的装饰
        return EnDecodeUtil.encode(str);
    }
}
