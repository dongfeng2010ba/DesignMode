package com.dong.responbilityChain;

public class ConcreteHandlerA extends Handler {


    @Override
    public void HandleRequest(int request) {
        if (request < 10 && request > 0) {
            System.out.println(getName() + "批准了");
        } else if (getSuccessor() != null) {
            getSuccessor().HandleRequest(request);
        }
    }
}
