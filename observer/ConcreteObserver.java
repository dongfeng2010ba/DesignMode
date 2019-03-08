package com.dong.observer;

public class ConcreteObserver implements Observer {
    //设置观察者的名字
    private String name;



    public ConcreteObserver(String name){
        this.name = name;

    }
    @Override
    public void update(String subjectState) {
        System.out.println("观察者"+name+"收到最新的 "+subjectState+" 消息，观察者正在更新信息。。。");
    }
}
