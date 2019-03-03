package com.dong.SimpleFactory;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数A");
        double numberA = scanner.nextDouble();
        System.out.println("请输入第二个数B");
        double numberB = scanner.nextDouble();
        System.out.println("请输入要进行的运算");
        scanner.nextLine();
        String operator = scanner.nextLine();

        //工厂类（静态）方法产生所需的运算符对象
        Operation operation = OperationFactory.createOperation(operator);

        operation.numberA = numberA;
        operation.numberB = numberB;


        System.out.println("运算结果为" + operation.result());


    }

}
