package com.dong.command;

public class Receiver {
    private String name;



    public Receiver(String name) {
        this.name = name;
    }


    public void execute(String concreteCommand){
        System.out.println("命令"+concreteCommand+"已经被"+name+"执行");
    }
}
