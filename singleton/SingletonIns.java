package com.dong.singleton;

public final class SingletonIns {
    //饿汉式，静态成员随类加载而初始化一次，或者写在静态代码块中
    private static SingletonIns single = new SingletonIns();
    private SingletonIns(){}


    public static SingletonIns getInstance(){
        System.out.println("get对象");
        return single;
    }
}
