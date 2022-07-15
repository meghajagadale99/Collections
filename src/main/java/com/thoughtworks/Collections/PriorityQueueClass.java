package com.thoughtworks.Collections;

import java.util.PriorityQueue;

public
class PriorityQueueClass {
    public static
    void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new CustomComparator());
        priorityQueue.add(1);
        priorityQueue.offer(2);
        priorityQueue.offer(3);
        priorityQueue.add(5);
        System.out.println(priorityQueue);
        int number = priorityQueue.peek();
        System.out.println(number);
        boolean result = priorityQueue.remove(2);
        System.out.println(result);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
    }
}
