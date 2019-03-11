package com.dong.composite;

public class Test {
    public static void main(String[] args){
        Composite root = new Composite("总公司");
        Leaf root_leaf1 = new Leaf("总财务");
        Leaf root_leaf2 = new Leaf("总人力");
        root.add(root_leaf1);
        root.add(root_leaf2);
        Composite huaDong = new Composite("华东分公司");
        root.add(huaDong);



        Leaf huaDong_leaf1 = new Leaf("华东财务");
        Leaf huaDon_leaf2 = new Leaf("华东人力");
        huaDong.add(huaDong_leaf1);
        huaDong.add(huaDon_leaf2);

        Composite nanJing = new Composite("南京分公司");
        huaDong.add(nanJing);


        root.display(0);



    }
}
