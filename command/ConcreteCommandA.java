package com.dong.command;
/*
* 具体的A命:，烤鸡翅
*
* */
public class ConcreteCommandA extends Command{
    public String concreteCommand = "烤鸡翅";

    public ConcreteCommandA(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void exeCommand() {
        receiver.execute(concreteCommand);
    }
}
