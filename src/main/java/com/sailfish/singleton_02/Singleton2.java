package com.sailfish.singleton_02;

/**
 * @author sailfish
 * @create 2017-04-04-下午11:17
 */
public class Singleton2 {

    private Singleton2() {

    }

    private static Singleton2 instance = null;
    public static Singleton2 get(){
        synchronized (Singleton2.class) {
            if (instance == null) {
                instance = new Singleton2();
            }
        }
        return instance;
    }
}
