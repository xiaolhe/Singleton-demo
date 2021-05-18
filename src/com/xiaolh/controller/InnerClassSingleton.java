package com.xiaolh.controller;

/**
 * Create by xiaolhe
 * Date: 2020:07:29  01:52
 */
public class InnerClassSingleton {
    //1.在类里面创建一个静态内部类
    private static class SingleonHolder{
        //2.静态内部类初始化一个外部类的变量，并用 static final修饰
        private static final InnerClassSingleton innerClass = new InnerClassSingleton();
    }

    //3.创建一个私有化构造方法
    private InnerClassSingleton(){

    }

    //4.外部类的变量可以直接返回静态内部类的该变量
    public static final InnerClassSingleton getInstance(){
        //直接返回外部类的该变量
        return SingleonHolder.innerClass;
    }
}
