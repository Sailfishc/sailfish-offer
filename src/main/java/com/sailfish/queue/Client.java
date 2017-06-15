package com.sailfish.queue;

/**
 * @author sailfish
 * @create 2017-06-15-下午9:09
 */
public class Client {

    /**
     * 初始化queue
     * @return
     */
    QueueType initQueue(){
        QueueType queue;
        if ((queue = new QueueType()) != null) {
            queue.head = 0;
            queue.tail = 0;
            return queue;
        }
        return null;
    }

    /**
     * 判断是否是空队列
     * @param queue
     * @return
     */
    boolean queueIsEmpty(QueueType queue) {
        if (queue.head == queue.tail) {
            return true;
        }
        return false;
    }

    boolean queueIsFull(QueueType queueType) {
        if (queueType.tail == QueueType.MAXLEN) {
            return true;
        }
        return false;
    }

    /**
     * 请空队列
     * @param queueType
     */
    void clearQueue(QueueType queueType) {
        if (queueType != null) {
            queueType.head = 0;
            queueType.tail = 0;
        }
    }

    void freeQueue(QueueType queueType) {
        if (queueType != null) {
            queueType = null;
        }
    }

    int inQueue(QueueType queueType, Data data) {
        if (queueType.tail == QueueType.MAXLEN) {
            System.out.println("队列已满");
            return 0;
        } else {
            queueType.data[queueType.tail++] = data;
            return 1;
        }
    }

    Data outQueue(QueueType queueType) {
        if (queueType.head == 0) {
            System.out.println("队列已空");
            System.exit(0);
        } else {
            return queueType.data[head++];
        }
        return null;
    }
}
