package com.thoughtworks.Collections;

import java.util.TreeSet;

public
class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        System.out.println("Using higher: " + numbers.higher(4));

        System.out.println("Using lower: " + numbers.lower(4));

        System.out.println("Using ceiling: " + numbers.ceiling(4));

        System.out.println("Using floor: " + numbers.floor(3));

        System.out.println("Using headSet without boolean value: " + numbers.headSet(5));

        System.out.println("Using headSet with boolean value: " + numbers.headSet(5, true));

        System.out.println("Using tailSet without boolean value: " + numbers.tailSet(4));

        System.out.println("Using tailSet with boolean value: " + numbers.tailSet(4, false));

        System.out.println("Using subSet without boolean value: " + numbers.subSet(4, 6));

        System.out.println("Using subSet with boolean value: " + numbers.subSet(4, false, 6, true));
    }
}

