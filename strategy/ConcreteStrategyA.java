package com.dong.strategy;

/**
 * @author: dong
 * @description:
 * 具体的策略A
 */
public class ConcreteStrategyA extends Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("this is ConcreteStrategyA");
    }
}
