package com.dong.memento;
/*
* 管理备忘录的管理者
* */
public class CareTaker {
    private Memento memento;

    public CareTaker() {
    }

    public CareTaker(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }


}
