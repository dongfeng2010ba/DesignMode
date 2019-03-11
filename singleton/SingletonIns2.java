package com.dong.singleton;

public final class SingletonIns2 {
    //第二种是通过私有静态内部类的方法来得到
    public static SingletonIns2 getInstance(){
        return SingleHolder.getInstance();
    }

    private static class SingleHolder {
        private static SingletonIns2 instance = new SingletonIns2();

        private SingleHolder() {
        }

        public static SingletonIns2 getInstance() {
            System.out.println("get对象");

            return SingleHolder.instance;
        }
    }

}
