package com.xiaolh.controller;

/**
 * Create by 肖橙橙
 * Date: 2020:07:29  00:55
 * Desc:非线程安全懒汉式
 */
public class SluggardUnsafeSingleton {
    //1.私有化一个类变量
    private static SluggardUnsafeSingleton sluggardUnsafeSingleton;
    //2.私有化一个构造方法
    private SluggardUnsafeSingleton(){

    }


    public static SluggardUnsafeSingleton getInstance(){
        //3.判断是否为空，如果为空，则new ，否则就直接返回
        if (sluggardUnsafeSingleton == null ){
            sluggardUnsafeSingleton = new SluggardUnsafeSingleton();
        }
        return sluggardUnsafeSingleton;
    }

}
