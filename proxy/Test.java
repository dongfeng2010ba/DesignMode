package com.dong.proxy;

public class Test {
    public static void main(String[] args) {
        RealSubject xiaowang = new RealSubject("xiaowang");
        Proxy p = new Proxy(xiaowang);
        p.request();
    }
}
