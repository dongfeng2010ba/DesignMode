package com.dong.SimpleFactory;

public class OperationFactory {
    public static Operation createOperation(String operator) {
        Operation operation;
        switch (operator) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("unsupported operation");

        }
        return operation;

    }
}
