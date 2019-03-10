package com.dong.facade;

public class Facade {
    private SubSystemA A;
    private SubSystemB B;
    private SubSystemC C;

    public Facade(){
        this.A = new SubSystemA();
        this.B = new SubSystemB();
        this.C = new SubSystemC();
    }

    public void method(){
        A.methodA();
        B.methodB();
    }
    public void method2(){
        A.methodA2();
        B.methodB2();
        C.methodC2();
    }


}
