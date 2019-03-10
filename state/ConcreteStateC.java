package com.dong.state;

public class ConcreteStateC extends State {

    @Override
    public void handle(Context context) {
        System.out.println("现在是状态C");
        context.setState(new ConcreteStateA());
    }
}
