package com.thoughtworks.Collections;

import java.util.IdentityHashMap;
import java.util.Map;

public
class IdentityHashMapClass {
    public static
    void main(String[] args) {
        Map<String, Integer> map = new IdentityHashMap<>();
        map.put("megha", 1);
        map.put(new String("neha"), 1);
        System.out.println(map);

        Map<Integer, String> m1 = new IdentityHashMap<>();
        Integer i1 = new Integer(22);
        Integer i2 = new Integer(22);

        m1.put(i1, "sam");
        m1.put(i2, "ana");

        System.out.println(m1);
    }
}
