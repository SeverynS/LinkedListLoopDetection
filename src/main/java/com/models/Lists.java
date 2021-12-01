package com.models;

public class Lists {
    public static class Node {
        public Node(int value) {
            this.value = value;
        }

        public Node next;
        public int value;
    }

    public Node generateLoop(int listLength) {
        Node[] nodes = new Node[listLength];
        Node head = randomNode();
        Node tail = head;
        for (int i = 0; i < listLength - 1; i++) {
            nodes[i] = tail;
            tail.next = randomNode();
            tail = tail.next;
        }

        int randomIndex = (int) (Math.random() * listLength);
        if (randomIndex < listLength) {
            tail.next = nodes[randomIndex];
        }
        return head;
    }

    private Node randomNode() {
        return new Node((int) (Math.random() * 100));
    }
}
