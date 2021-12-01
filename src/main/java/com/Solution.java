package com;

import com.models.Lists;
import java.util.HashSet;

public class Solution {
    public static boolean hasCycle(Lists.Node head) {
        HashSet<Lists.Node> headLinks = new HashSet<>();
        if(head == null){
            return false;
        }
        while(head.next != null){
            if(headLinks.contains(head.next)){
                return true;
            }
            headLinks.add(head.next);
            head = head.next;
        }
        return false;
    }
}
