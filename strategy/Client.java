package com.dong.strategy;

/**
 * @author: dong
 * @description:
 *  客户端的调用策略的过程
 */
public class Client {
    public static void main(String[] args) {
        //实际应用时strategyA可以是从外界接受的一个参数，实现了解耦
        Strategy  strategy = new ConcreteStrategyA();
        StragegyContext  context = new StragegyContext(strategy);
        context.contextInterface();
    }
}
