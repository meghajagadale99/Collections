package com.thoughtworks.Collections;

import java.util.Deque;
import java.util.LinkedList;

public
class LinkedListDequeClass {
    public static
    void main(String[] args) {
        Deque<String> animals = new LinkedList<>();

        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        animals.addFirst("Dog");
        System.out.println("LinkedList after addFirst(): " + animals);

        animals.addLast("Zebra");
        System.out.println("LinkedList after addLast(): " + animals);

        animals.removeFirst();
        System.out.println("LinkedList after removeFirst(): " + animals);

        animals.removeLast();
        System.out.println("LinkedList after removeLast(): " + animals);
    }
}
