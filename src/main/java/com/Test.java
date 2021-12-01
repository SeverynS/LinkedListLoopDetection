package com;

import com.models.Lists;

public class Test {
    public static void main(String[] args) {
        Lists.Node list = new Lists().generateLoop(11);
        System.out.println(Solution.hasCycle(list));
    }
}
