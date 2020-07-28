package com.xiaolh.controller;

/**
 * Create by 肖橙橙
 * Date: 2020:07:29  01:42
 */
public class HungrySingleton {
    //1.私有化一个类变量，并初始化
    private static final HungrySingleton  hungrySingleton = new HungrySingleton();
    //2.私有化一个构造方法
    private HungrySingleton(){

    }
    //3,直接返回初始化的类变量
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
