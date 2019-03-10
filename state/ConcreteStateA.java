package com.dong.state;

public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        System.out.println("现在是状态A");
        context.setState(new ConcreteStateB());
    }
}
