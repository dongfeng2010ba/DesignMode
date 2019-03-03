package com.dong.SimpleFactory;


public class OperationAdd extends Operation {
    @Override
    public double result() {
        return numberA + numberB;
    }
}
