package com.dong.memento;

/*
*备忘录类，用来记录信息
*/
public class Memento {
    private String state;

    public Memento() {
    }

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
