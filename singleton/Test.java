package com.dong.singleton;

public class Test {
    public static void main(String[] args) {
        //第一种方式，饿汉式，在静态
        SingletonIns s1 = SingletonIns.getInstance();
        SingletonIns2 s2 = SingletonIns2.getInstance();

    }
}
