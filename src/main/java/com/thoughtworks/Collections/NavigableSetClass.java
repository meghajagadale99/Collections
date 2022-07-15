package com.thoughtworks.Collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public
class NavigableSetClass {
    public static
    void main(String[] args) {

        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("NavigableSet: " + numbers);

        int firstElement = numbers.first();
        System.out.println("First Number: " + firstElement);

        int lastElement = numbers.last();
        System.out.println("Last Element: " + lastElement);

        int number3 = numbers.higher(2);
        System.out.println("Higher: " + number3);

        int number4 = numbers.floor(2);
        System.out.println("Greatest element less than or equal to 11 is: " + number4);

        int number1 = numbers.pollFirst();
        System.out.println("Removed First Element: " + number1);

        int number2 = numbers.pollLast();
        System.out.println("Removed Last Element: " + number2);
    }
}
