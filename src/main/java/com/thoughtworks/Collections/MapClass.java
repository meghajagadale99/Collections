package com.thoughtworks.Collections;

import java.util.*;

public
class MapClass {
    public static
    void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "megha");
        map.put(12, "hello");

        Set<Integer> keySet = map.keySet();
        System.out.println("keys: "+ keySet);

        Collection<String> value=map.values();
        System.out.println("value:"+ value);

//        Set set = map.entrySet();
//        Iterator itr = set.iterator();
//        while (itr.hasNext()) {
//            Map.Entry entry = (Map.Entry) itr.next();
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }
}
