package com.thoughtworks.Collections;

import java.util.concurrent.ConcurrentHashMap;

public
class ConcurrentHashMapClass {
    public static
    void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("megha",1);
        concurrentHashMap.put("neha",2);
        concurrentHashMap.put("mayur",3);
        concurrentHashMap.put("pranali",4);

        System.out.println(concurrentHashMap);
        System.out.println(concurrentHashMap.values());
        System.out.println(concurrentHashMap.entrySet());
        System.out.println(concurrentHashMap.keySet());
        System.out.println(concurrentHashMap.get("megha"));


    }
}
