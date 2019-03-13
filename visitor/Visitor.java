package com.dong.visitor;

import com.dong.command.ConcreteCommandA;

/*
* visitor类似于书中的状态抽象类，里面的方法数量是确定的，
* 就只有男人相关的和女人相关的，所以访问者模式只适合数据类型固定的
* visitorConCreteEleA 类似男人
* visitorConCreteEleB 类似女人
* */
public abstract class Visitor {
    public abstract void visitorConCreteEleA(ConcreteEleA A);
    public abstract void visitorConCreteEleB(ConcreteEleB B);

}
