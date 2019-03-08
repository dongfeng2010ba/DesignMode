package com.dong.observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    //设置一个具体的子主题，这样每个主题都是不同方面的信息通知，例如这是关于足球方面的进球主题
    //还可以有篮球方面进球的主题，可以通过字符串subjectState来区别

    private String subjectState;
    private ArrayList<Observer> observers;

    public ConcreteSubject(String subjectState){
        this.subjectState = subjectState;
        observers = new ArrayList<>();
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void detach(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0){
            observers.remove(i);
        }


    }

    @Override
    public void notifyObervers() {
        for (Observer observer : observers) {
            observer.update(subjectState);
        }
    }
}
