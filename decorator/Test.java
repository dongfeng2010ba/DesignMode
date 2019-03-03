package com.dong.decorator;

public class Test {
    public static void main(String[] args) {
        String str = "im super man";
        //三层装饰，加密一次，解密一次（前两层装饰抵消）,大写一次
        Component component = new ConcreteComponent();
        Decorator Muldecorator = new UpperDecorator(new DecodeDecorator(new EncodeDecorator(component)));


        String result =  Muldecorator.display(str);
        //所以最终结果只有大写效果
        System.out.println(result);


    }
}
