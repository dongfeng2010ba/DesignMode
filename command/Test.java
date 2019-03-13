package com.dong.command;

public class Test {
    public static void main(String[] args) {
        Receiver cooker = new Receiver("厨子Tim");
        //下烤肉的命令
        Command kaoRou = new ConcreteCommandA(cooker);
        Invoker waiter = new Invoker();
        waiter.setCommand(kaoRou);
        waiter.giveOrder();
    }
}
