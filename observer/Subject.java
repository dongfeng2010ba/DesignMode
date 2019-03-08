package com.dong.observer;

import java.util.ArrayList;
import java.util.List;
/*
* 虽然是抽象类，但是没有抽象方法，全部都实现了，就是为了让子类继承就行了
* */
public interface Subject {



    public void attach(Observer observer);

    public void detach(Observer observer);

    public void notifyObervers();
}
