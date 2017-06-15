package com.sailfish.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sailfish
 * @create 2017-06-15-下午12:13
 */
public class IteratorClass {

    class Node{
        private int value;
        private Node node;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNode() {
            return node;
        }

        public void setNode(Node node) {
            this.node = node;
        }
    }

    class Iterator{

        public Iterator(Node node){
            node = new Node();
        }


        public boolean hasNext(){
            return false;
        }


        public Node next(){

            return null;
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");

        java.util.Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
