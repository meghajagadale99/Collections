package com.thoughtworks.Collections;

import java.util.HashMap;
import java.util.Map;

public
class HashMapClass {
    public static
    void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "megha");
        hashMap.put(2, "neha");
        hashMap.put(3, "sneha");
        hashMap.put(4, "sam");
        System.out.println(hashMap);
        String result = hashMap.get(2);
        System.out.println(result);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.entrySet());
        hashMap.replace(2, "mayur");
        System.out.println(hashMap);
        for (Integer key : hashMap.keySet()) {
            System.out.println(key);
        }
        for (String value : hashMap.values()) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }

        HashMap<Integer, String> map = new HashMap<>();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        map.put(i1,"megha");
        map.put(i2,"megha");
        System.out.println(map);
    }
}
