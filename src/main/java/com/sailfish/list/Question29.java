package com.sailfish.list;

/**
 * 我们能在 Switch 中使用 String 吗？
 *
 * @author sailfish
 * @create 2017-05-26-上午8:23
 */
public class Question29 {

    //从 Java 7 开始，我们可以在 switch case 中使用字符串，但这仅仅是一个语法糖。内部实现在 switch 中使用字符串的 hash code

    public static void main(String[] args) {
        String food = "apple";
        switch (food) {
            case "banana":
                System.out.println("banana");
                break;
            case "apple":
                System.out.println("apple");
                break;
            case "pizza":
                System.out.println("pizza");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
