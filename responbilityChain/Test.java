package com.dong.responbilityChain;
/*
* 职责链模式类似于向领导请假，小事组长批准，大事，组长处理不了，递交经理，经理批准处理
* 再不行就可以继续往下，层层递进
* */
public class Test {
    public static void main(String[] args) {
        ConcreteHandlerA teamleader = new ConcreteHandlerA();
        teamleader.setName("组长");
        ConcreteHandlerB manager = new ConcreteHandlerB();
        manager.setName("经理");

        teamleader.setSuccessor(manager);

        int[] requests = {1, 3, 4, 2, 50, 4, 2, 49, 26};

        for (int i = 0; i < requests.length; i++) {
            teamleader.HandleRequest(requests[i]);
        }
    }
}
