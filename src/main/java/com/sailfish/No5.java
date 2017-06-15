package com.sailfish;

/**
 * @author sailfish
 * @create 2017-06-15-下午4:20
 */
public class No5 {



    private static Node reserver(Node head){

        return null;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        Node node = listNode(node1);
        while (node != null) {

            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    private static Node listNode(Node head){
        if (head.getNext() == null) {
            return head;
        }
        return head.getNext();
    }
}

class Node{
    private int value;
    private Node next;

    public Node(int value) {
        super();
        this.value = value;
    }

    public Node(int value, Node next) {
        super();
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}