package com.thoughtworks.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public
class QueueInterface {
    public static
    void main(String[] args) {
     //   first in first out
        Queue<Integer> numbers = new PriorityQueue<>();

        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        System.out.println("Queue: " + numbers);

        int Number = numbers.peek();
        System.out.println("Accessed Element: " + Number);

        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
    }
}
