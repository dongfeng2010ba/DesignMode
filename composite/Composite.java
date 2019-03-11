package com.dong.composite;

import java.util.ArrayList;

/*
* 抽象类Component的具体实现类，类似数中的具体公司或者具体的分公司
* */
public class Composite extends Component {
    private ArrayList<Component> list = new ArrayList<>();

    public Composite(String name){
        super(name);
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void display(int depth) {
        //在这里打印本级层次，并且打印他下面的子级
        System.out.println(StringUtils.repeatableString("-",depth)+this.name);
        for (Component component : list) {
            component.display(depth+2);
        }
    }


}
