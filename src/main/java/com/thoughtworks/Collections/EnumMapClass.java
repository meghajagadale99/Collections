package com.thoughtworks.Collections;

import java.util.EnumMap;

public
class EnumMapClass {
    public static
    void main(String[] args) {
        EnumMap<Size, Integer> enumMap = new EnumMap<>(Size.class);
        enumMap.put(Size.SMALL, 1);
        enumMap.put(Size.MEDIUM, 2);
        enumMap.put(Size.LARGE, 3);
        enumMap.put(Size.EXTRALARGE, 4);
        System.out.println(enumMap);
        System.out.println(enumMap.entrySet());
        System.out.println(enumMap.values());
        System.out.println(enumMap.keySet());
        int result = enumMap.get(Size.LARGE);
        System.out.println(result);
        boolean result1 = enumMap.remove(Size.LARGE,3);
        System.out.println(result1);
    }

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
}
