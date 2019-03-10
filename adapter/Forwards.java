package com.dong.adapter;
/*
前锋类继承抽象类Player
* */
public class Forwards extends Player {
    public Forwards(String name){
        super(name);
    }
    @Override
    public void attack() {
        System.out.println("前锋"+getName()+"正在进攻");
    }

    @Override
    public void defence() {
        System.out.println("前锋"+getName()+"正在防守");

    }
}
