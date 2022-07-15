package com.thoughtworks.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public
class ListIteratorInterface {
    public static
    void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        System.out.println(" List Iterator list " + numbers);

       ListIterator<Integer> iterator= numbers.listIterator();

        int result3 = iterator.next();
        System.out.println(result3);

        int result4 = iterator.nextIndex();
        System.out.println(result4);

        int result = iterator.previous();
        System.out.println(result);

        int result1 = iterator.previousIndex();
        System.out.println(result1);
    }
}
