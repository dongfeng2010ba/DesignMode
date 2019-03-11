package com.dong.memento;

public class Test {
    public static void main(String[] args) {
        Originator role = new Originator();
        role.setState("满血满状态");
        //备忘录管理者CareTaker
        CareTaker manager = new CareTaker();
        manager.setMemento(role.saveMemento());
        role.show();

        role.setState("没血没蓝了");
        role.show();

        System.out.println("======备忘录开始恢复======");
        role.recoverMemento(manager.getMemento());
        role.show();
    }
}
