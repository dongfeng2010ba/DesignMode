package com.dong.responbilityChain;

public abstract class Handler {
    private Handler successor;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Handler() {
    }

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void HandleRequest(int request);
}
