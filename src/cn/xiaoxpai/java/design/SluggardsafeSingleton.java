package cn.xiaoxpai.java.design;

/**
 * Create by xiaoxpai
 * Date: 2020:07:29  01:05
 * Desc:线程安全懒汉式
 */
public class SluggardsafeSingleton {
    //1.私有化一个类变量
    private static SluggardsafeSingleton sluggardsafeSingleton;

    //2.私有化一个构造方法
    private SluggardsafeSingleton(){

    }

    //3.通过synchronized对方法加锁，再判断是否为空，为空则new 否则就直接返回
    public static synchronized SluggardsafeSingleton getInstance(){
        if (sluggardsafeSingleton ==null ){
            sluggardsafeSingleton = new SluggardsafeSingleton();
        }
        return sluggardsafeSingleton;
    }

}
