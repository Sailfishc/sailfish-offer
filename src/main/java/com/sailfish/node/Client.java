package com.sailfish.node;

/**
 * 规律：要查找尾节点（tail）的话就要声明一个temp
 *
 * @author sailfish
 * @create 2017-06-15-下午5:31
 */
public class Client {


    public static void main(String[] args) {
        Node node1 = new Node();
        Data data = new Data();
        data.age = 22;
        data.key = "key1";
        data.name = "name1";
        node1.data = data;

        Node node = addEndNode(null, data);
        System.out.println(node.data.toString());
    }

    /**
     * 插入到最后的节点
     */
    public static Node addEndNode(Node head, Data data) {
        Node node, htemp;
        if ((node = new Node()) == null) {
            System.out.println("申请内存失败!");
            return null;
        } else {

            //先保存节点数据
            node.data = data;
            node.next = null;

            if (head == null) {
                //如果头结点为空，就将当前节点作为头结点
                head = node;
                return head;
            }

            htemp = head;
            while (htemp != null) {
                //找到最后的节点
                htemp = htemp.next;
            }

            htemp.next = node;
            return head;
        }
    }


    /**
     * 插入节点到头结点
     */
    public static Node addFirstNode(Node head, Data data) {
        Node node;
        if ((node = new Node()) == null) {
            System.out.println("申请内存失败!");
            return null;
        } else {
            //申请内存，赋值节点，将下一个节点指向head
            node.data = data;
            node.next = head;
            //将node赋值给head
            head = node;
            return head;
        }
    }

    /**
     * 查找节点
     */
    public static Node findNode(Node head, String key) {
        Node htemp;
        htemp = head;
        while (htemp != null) {
            if (htemp.data.key.compareTo(key) == 0) {
                return htemp;
            }
            htemp = htemp.next;
        }
        return null;
    }

    /**
     * 插入一个节点
     */
    public static Node insertNode(Node head, String findKey, Data data) {
        Node node, nodeTemp;
        if ((node = new Node()) == null) {
            System.out.println("申请内存失败!");
            return null;
        }
        //创建node
        node.data = data;
        //找到要插入的节点
        nodeTemp = findNode(head, findKey);

        if (nodeTemp != null) {
            Node tempNodeNext = nodeTemp.next;
            nodeTemp.next = node;
            node.next = tempNodeNext;
        } else {
            System.out.println("未找到正确的插入地址!");
            // TODO: 2017/6/15
            return null;
        }
        return head;
    }

    /**
     * 删除节点
     * @param head
     * @param key
     * @return
     */
    public static int deleteNode(Node head, String key) {
        //要删除必须要先找到
        Node tempNode, node;
        tempNode = head;
        node = head;
        while (tempNode != null) {
            if (tempNode.data.key.compareTo(key) == 0) {
                node.next = tempNode.next;
                //  free(tempNode);
                return 1;
            } else {
                node = tempNode;
                tempNode = tempNode.next;
            }
        }
        return 0;
    }

    /**
     * 遍历所有的节点
     * @param head
     * @return
     */
    public static void allNodes(Node head){
        Node tempNode;
        tempNode = head;
        while (tempNode != null) {
            Data data = tempNode.data;
            System.out.println(data.toString());
            tempNode = tempNode.next;
        }
    }
}
