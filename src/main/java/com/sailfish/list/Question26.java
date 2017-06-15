package com.sailfish.list;

/**
 * 3*0.1 == 0.3 将会返回什么？true 还是 false？
 * @author sailfish
 * @create 2017-05-26-上午8:18
 */
public class Question26 {

    public static void main(String[] args) {
        double x = 3 * 0.3;
        System.out.println(x == 0.3); //false，因为有些浮点数不能完全精确的表示出来。
    }
}
