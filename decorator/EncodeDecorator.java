package com.dong.decorator;
/*
*
* 编码装饰器
* */
public class EncodeDecorator extends Decorator{
    public EncodeDecorator(Component component){
        super(component);
    }

    @Override
    public String display(String str) {
        //waitForDecor是component的display输出后的原始字符串也即等待被被装饰的字符串
        String waitForDecor =  component.display(str);
        return transform(waitForDecor);
    }



    @Override
    public String transform(String str) {
        System.out.println("正在装饰：加密");
        //解密装饰器的具体的装饰过程，用加密算法复写，当然也可以是其他的形式的装饰
        return EnDecodeUtil.encode(str);
    }
}
