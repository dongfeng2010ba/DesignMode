package com.dong.responbilityChain;

public class ConcreteHandlerB extends Handler {
    @Override
    public void HandleRequest(int request) {
        if (request < 100 && request >= 10) {
            System.out.println(getName() + "批准了");
        } else if (getSuccessor() != null) {
            getSuccessor().HandleRequest(request);
        }
    }
}
