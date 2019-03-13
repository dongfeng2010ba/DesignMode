package com.dong.visitor;

import java.util.ArrayList;

/*
* 类似书中的男女对于状态的对比器
* */
public class ObjectStructure {
    public ArrayList<Element> list = new ArrayList<>();
    public void attach(Element element){
        list.add(element);
    }
    public void Detach(Element element){
        list.remove(element);
    }

    public void accept(Visitor visitor){
        for (Element element : list) {
            element.accpet(visitor);
        }

    }
}
