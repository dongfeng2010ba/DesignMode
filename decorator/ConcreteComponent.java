package com.dong.decorator;
/*
* 具体的组件对象，也即要被包装的对象
* */
public class ConcreteComponent implements Component{

    @Override
    public String display(String str) {
        //这里只是简单的处理一下传入的参数str
        System.out.println("屌丝字符串为："+str+"，需要被装饰");
        return str;
    }
}
