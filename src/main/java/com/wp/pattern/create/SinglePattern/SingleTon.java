package com.wp.pattern.create.SinglePattern;

/**
 * @author pan.wu
 * @date 2019/12/19 17:22
 * @Description
 *
 * 单例设计模式的一般定义：一个类中只允许有一个实例。 实现思路：让类的构造方法私有化，同时提供一个静态方法去实例化这个类。
 *
 * 懒汉式：在静态方法中初始化。时间换空间。（不推荐，时间很重要） 饿汉式：在声明对象就初始化。空间换时间。（推荐，空间不是问题）
 *
 * 懒汉式线程不安全，需要加上同步锁，同步锁影响了程序执行效率 饿汉式天生线程安全，类加载的时候初始化一次对象，效率比懒汉式高。
 *
 * 注意私有构造方法
 */
public class SingleTon {

    /**
     * 定义成私有构成方法，变成单例的 单例模式的核心
     */
    private SingleTon() {}

    /******************************* 饿汉式写法 *********************************/
    // 饿汉式：类加载的时候即进行初始化
    private static final SingleTon single = new SingleTon();

    public static SingleTon getInstance1() {
        return single;
    }

    /******************************* 懒汉式写法 *********************************/
    // 懒汉式 双重校验锁保证线程安全，比较好的写法  --- volatile 禁止指令重排 主要由于new SinglePattern();可能出现问题
    private volatile static SingleTon myTest = null;

    public static SingleTon getInstance2() {
        if (myTest == null) {
            synchronized (SingleTon.class) {
                if (myTest == null) {
                    myTest = new SingleTon();
                }
            }
        }
        return myTest;
    }
    /******************************* 静态内部类写法 *********************************/

    /***
     * 较为标准的写法 --- 静态内部类写法
     * 是否 Lazy 初始化：是
     * 是否多线程安全：是
     * @author kxm
     */
    private static class SingletonHolder {
        private static final SingleTon INSTANCE = new SingleTon();
    }
    public static final SingleTon getInstance3() {
        return SingletonHolder.INSTANCE;
    }
}
