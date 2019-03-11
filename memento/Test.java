package com.dong.memento;

public class Test {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("满血满状态");
        //备忘录管理者CareTaker
        CareTaker c = new CareTaker();
        c.setMemento(o.saveMemento());
        o.show();

        o.setState("没血没蓝了");
        o.show();

        System.out.println("======备忘录开始恢复======");
        o.recoverMemento(c.getMemento());
        o.show();
    }
}
