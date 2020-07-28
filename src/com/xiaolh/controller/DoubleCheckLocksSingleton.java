package com.xiaolh.controller;

/**
 * Create by 肖橙橙
 *
 * Date: 2020:07:29  01:46
 */
public class DoubleCheckLocksSingleton {
    //1.使用volatile修饰类变量
    private static byte[] lock = new byte[0];
    private volatile static DoubleCheckLocksSingleton singleton;
    //2.私有化构造方法
    private DoubleCheckLocksSingleton(){

    }

    //3.先判断类变量是否为空，如果为空，则用synchronized进行枷锁，并实例化，如果不为空，则直接返回
    public static DoubleCheckLocksSingleton getInstance(){
        if( singleton == null ){
            synchronized (lock){
                singleton = new DoubleCheckLocksSingleton();
            }
        }
        return singleton;
    }
}
