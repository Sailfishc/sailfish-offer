package com.sailfish.stack;

/**
 * @author sailfish
 * @create 2017-06-15-下午8:39
 */
public class Client {

    /**
     * 初始化栈
     */
    Stack initStack() {
        Stack stack;
        if ((stack = new Stack()) != null) {
            stack.top = 0;
            return stack;
        }
        return stack;
    }


    /**
     * 如果top为0就说明栈是空的
     */
    boolean stackIsEmpty(Stack stack) {
        boolean t;
        t = (stack.top == 0);
        return t;
    }

    /**
     * 如果top等于Max就是满栈
     */
    boolean stackIsFull(Stack stack) {
        boolean t;
        t = (stack.top == Stack.MAXLEN);
        return t;
    }

    /**
     * 清空栈：将元素清空，不等于释放
     */
    void clearStack(Stack stack) {
        stack.top = 0;
    }

    /**
     * 释放空间
     */
    void freeStack(Stack stack) {
        if (stack != null) {
            stack = null;
        }
    }

    /**
     * 入栈
     */
    int pushStack(Stack stack, Data data) {
        if ((stack.top + 1) > Stack.MAXLEN) {
            System.out.println("栈内存溢出");
            return 0;
        }
        //数组先增一在赋值
        stack.data[++stack.top] = data;
        return 1;
    }

    /**
     * 出栈
     * @param stack
     * @return
     */
    Data popStack(Stack stack) {
        if (stack.top == 0) {
            System.out.println("栈是空的");
            System.exit(0);
        }
        return (stack.data[stack.top--]);
    }
}
