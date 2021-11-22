package com.models;

public class ListNode {
     public int val;
     public ListNode next;
     public ListNode(int x) {
         val = x;
         next = null;
      }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
