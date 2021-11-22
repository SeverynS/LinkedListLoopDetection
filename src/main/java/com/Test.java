package com;

import com.models.ListNode;

public class Test {
    public static void main(String[] args) {
        ListNode listNode0 = new ListNode(0);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode3.setNext(listNode1);
        listNode1.setNext(listNode0);

        System.out.println(listNode0);
        System.out.println(listNode1);
        System.out.println(listNode2);
        System.out.println(listNode3);
        System.out.println("************************************");

        System.out.println(Solution.hasCycle(listNode0));
        System.out.println(Solution.hasCycle(listNode1));
        System.out.println(Solution.hasCycle(listNode2));
        System.out.println(Solution.hasCycle(listNode3));


    }
}
