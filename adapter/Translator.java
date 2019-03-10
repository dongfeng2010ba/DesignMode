package com.dong.adapter;
/*
* 用来帮助外籍中场听懂英文的装备,用来帮助外籍（中国）中场来适应NBA的中场身份（能听懂英语）
* */
public class Translator extends Player{

    private ForeignCenter fc;
    public Translator(String name){
        super(name);
        fc = new ForeignCenter(name);

    }

    @Override
    public void attack() {
        fc.进攻();

    }

    @Override
    public void defence() {
        fc.防守();
    }
}
