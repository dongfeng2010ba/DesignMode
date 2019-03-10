package com.dong.state;

public class ConcreteStateB extends State {
    @Override
    public void handle(Context context) {
        System.out.println("现在是状态B");
        context.setState(new ConcreteStateC());
    }
}
