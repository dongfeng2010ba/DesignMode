package com.dong.visitor;

public class Test {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        //对比器里面添加一个男人
        o.attach(new ConcreteEleA());

        //对比器里面添加一个女人
        o.attach(new ConcreteEleB());

        //对比器接收一个成功状态ConcreteVisitorA
        o.accept(new ConcreteVisitorA());

        //对比器接收一个失败状态ConcreteVisitorB
        o.accept(new ConcreteVisitorB());
    }
}
