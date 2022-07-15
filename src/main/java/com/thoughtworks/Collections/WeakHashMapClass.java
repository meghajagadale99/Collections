package com.thoughtworks.Collections;
import java.util.WeakHashMap;

public
class WeakHashMapClass {
    public static
    void main(String[] args) throws InterruptedException {
        WeakHashMap weakHashMap = new WeakHashMap();
        Temp temp = new Temp();
        weakHashMap.put(1,temp);
        System.out.println(weakHashMap);
        System.gc();
        Thread.sleep(5000);
        System.out.println(weakHashMap);
    }
}
