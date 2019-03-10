package com.dong.adapter;

public abstract class Player {
    protected String name;
    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attack();
    public abstract void defence();
}
