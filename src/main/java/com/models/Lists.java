package com.models;

import java.util.Arrays;

public class Lists {
    int length;
    Node[] nodes;

    public Lists(int length) {
        this.length = length;
        nodes = generateLoop(length);
    }

    public static class Node {
        public int value;
        public Node next;
        public Node(int x) {
            value = x;
            next = null;
        }

        public Node getNext() {
            return next;
        }

        @Override
        public String toString() {
            return "Node{" + value + '}';
        }
    }

    public Node[] generateLoop(int listLength) {
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
        return nodes;
    }

    private Node randomNode() {
        return new Node((int) (Math.random() * 100));
    }

    @Override
    public String toString() {
        return "Lists{" +
                Arrays.toString(nodes) +
                '}';
    }
}
