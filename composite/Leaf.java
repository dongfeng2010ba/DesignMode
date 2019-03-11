package com.dong.composite;
//叶子就相当于数中每一个层级里的财务处或人力资源，他们是没有子层级的
//希望每一层级的财务处或人力资源有相同的调用方式，
//由于没有子层级，所以类的内部不需要有集合ArrayList
public class Leaf extends Component{
    public Leaf(String name){
        super(name);
    }
    @Override
    public void add(Component component) {
        System.out.println("以及是叶子节点，不能再添加了");
    }

    @Override
    public void remove(Component component) {
        System.out.println("以及是叶子节点，不能再删除了");

    }

    @Override
    public void display(int depth) {
        //// 通过“-”的数目显示级别
        System.out.println(StringUtils.repeatableString("-",depth)+this.name);
    }
}
