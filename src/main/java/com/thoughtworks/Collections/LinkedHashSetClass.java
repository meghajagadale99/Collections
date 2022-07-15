package com.thoughtworks.Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public
class LinkedHashSetClass {
    public static
    void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(1,2,3,4,5));

        LinkedHashSet<Integer> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.addAll(Arrays.asList(4,5,6,7,8));

       // linkedHashSet.retainAll(linkedHashSet1);
       //linkedHashSet.addAll(linkedHashSet1);
        linkedHashSet.remove(0);
        System.out.println(linkedHashSet);
    }
}
