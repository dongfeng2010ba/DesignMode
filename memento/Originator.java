package com.dong.memento;
/*
* 需要备忘录的人
* */
public class Originator {
    private String state;

    //保存备忘录其实就是在保存状态了
    //返回的Memento要被管理者接受保存
    public Memento saveMemento(){
        return new Memento(state);
    }

    public void recoverMemento(Memento memento){
        this.state = memento.getState();
    }

    public void show(){
        System.out.println("cur state is"+state);

    }

    public String  getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }



}
