package com.thoughtworks.Collections;

import java.util.LinkedHashMap;

public
class LinkedHashMapClass {
    public static
    void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("megha",1);
        linkedHashMap.put("neha",2);
        linkedHashMap.put("ganesh",3);
        linkedHashMap.put("pranali",4);
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.entrySet());
        System.out.println(linkedHashMap.keySet());
        System.out.println(linkedHashMap.values());

        int result =linkedHashMap.getOrDefault("sandra",5);
        System.out.println(result);

        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<>(linkedHashMap);
        numbers.putIfAbsent("sam",6);
        System.out.println(numbers);
    }
}
