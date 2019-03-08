package com.dong.observer;

public class Test {
    public static void main(String[] args) {
        ConcreteSubject cs = new ConcreteSubject("足球");
        cs.attach(new ConcreteObserver("巴萨球迷"));
        cs.attach(new ConcreteObserver("恒大球迷"));
        cs.notifyObervers();


        ConcreteSubject cs2 = new ConcreteSubject("篮球");
        cs2.attach(new ConcreteObserver("NBA球迷"));
        cs2.notifyObervers();

        System.out.println("===============");

        cs2.setSubjectState("NBA季后赛开始了！");
        cs2.notifyObervers();
    }
}
