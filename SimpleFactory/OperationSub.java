package com.dong.SimpleFactory;


public class OperationSub extends Operation {
    @Override
    public double result() {
        return numberA - numberB;
    }
}
