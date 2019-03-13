package com.dong.command;
/*
* 相当于书中的那个服务员（给厨子下命令）
* */
public class Invoker {
    private Command command;

    public Invoker() {
    }

    public Invoker(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }


    public void setCommand(Command command) {
        this.command = command;
    }

    public void giveOrder(){
        command.exeCommand();
    }
}
