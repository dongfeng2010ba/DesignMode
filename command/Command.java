package com.dong.command;



public abstract class Command {
    //命令的接收者，类似数中的烤肉师傅
     protected Receiver receiver;
     protected  String concreteCommand ;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }



    public abstract void exeCommand();
}
