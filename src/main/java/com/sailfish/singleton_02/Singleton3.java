package com.sailfish.singleton_02;

/**
 * 静态单例
 * @author sailfish
 * @create 2017-05-26-上午8:09
 */
public class Singleton3 {

    public Singleton3() {
    }

    private static class InnerSingle{
        private static Singleton3 instance = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return InnerSingle.instance;
    }
}
