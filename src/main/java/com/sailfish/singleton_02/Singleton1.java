package com.sailfish.singleton_02;

/**
 * 只适用于单线程环境
 * @author sailfish
 * @create 2017-04-04-下午11:12
 */
public class Singleton1 {

    private Singleton1() {

    }

    private static Singleton1 instance = null;

    public static Singleton1 get(){
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
