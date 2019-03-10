package com.dong.adapter;

public class Center extends Player {
    public Center(String name){
        super(name);
    }
    @Override
    public void attack() {
        System.out.println("中场"+getName()+"正在进攻");

    }

    @Override
    public void defence() {
        System.out.println("中场"+getName()+"正在防守");

    }
}
