package com.dong.adapter;

public class ForeignCenter {
    private String name;

    public ForeignCenter(String name){
       this.name = name;
    }

    public String getName() {
        return name;
    }

    public void 进攻() {
        System.out.println("中场"+getName()+"正在进攻");

    }


    public void 防守() {
        System.out.println("中场"+getName()+"正在防守");

    }
}
