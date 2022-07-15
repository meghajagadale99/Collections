package com.thoughtworks;

import java.util.*;

public
class RandomClass {
    public static
    void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for(int i =1;i<=10;i++){
            int number = random.nextInt(15);
            list.add(number);
        }
        System.out.println(list);
        Set<Integer> obj = new HashSet<>(list);
        System.out.println(obj);

    }
}
