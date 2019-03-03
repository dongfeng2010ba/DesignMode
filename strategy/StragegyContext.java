package com.dong.strategy;

/**
 * @author: dong
 * @description:
 * 策略的上下文专门用来接收并调用具体策略
 */
public class StragegyContext {
    private Strategy strategy;

    //构造函数，接收并初始化具体的策略
    public StragegyContext(Strategy strategy){
        this.strategy = strategy;
    }


    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
