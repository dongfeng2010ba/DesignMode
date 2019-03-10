package com.dong.adapter;

public class Test {
    public static void main(String[] args) {
        //Translator相当于一个能听懂英文的中场球员
        Player ym = new Translator("姚明");
        ym.attack();
        ym.defence();

        //正宗的外国NBA前锋
        Player bd = new Forwards("巴蒂尔");
        bd.attack();
        bd.defence();

    }
}
