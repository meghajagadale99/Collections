package com.thoughtworks.Collections;

import java.util.ArrayList;
import java.util.Collections;

public
class ArrayListAlgorithem {
    public static
    void main(String[] args) {

        // Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        // Add elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        System.out.println("Unsorted ArrayList: " + numbers);

        int result1 = Collections.frequency(numbers, 2);
        System.out.println("Repeted numbers:" + result1);

        boolean value = Collections.disjoint(numbers, num);
        System.out.println("Two lists are disjoint: " + value);

        Collections.reverse(numbers);
        System.out.println("Reverse the ArrayList" + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);

        Collections.swap(numbers, 0, 1);
        System.out.println("ArrayList using Swap" + numbers);

        Collections.fill(numbers, 5);
        System.out.println("ArrayList using Fill" + numbers);

        int result = Collections.binarySearch(numbers, 1);
        System.out.println("Binary Search:" + result);


    }
}
