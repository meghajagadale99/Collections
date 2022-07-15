package com.thoughtworks.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public
class IteratorInterfaceClass {
    public static
    void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.addAll(Arrays.asList(1, 2, 3, 4, 5));

        Iterator<Integer> iterator = l1.iterator();

        int result = iterator.next();
        System.out.println(result);

        iterator.remove();
        System.out.println(result);

        while (iterator.hasNext()) {
            iterator.forEachRemaining((value) -> System.out.println("numbers Are :" + value));
        }
    }
}
