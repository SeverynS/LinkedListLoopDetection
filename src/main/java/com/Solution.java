package com;

import com.models.ListNode;

public class Solution {
    public static boolean hasCycle(ListNode head) {
        int position = 0;

        while(head.next != null){
            if(position <= position - 1){
                return true;
            }
            position ++;
        }
        return false;
    }
}
