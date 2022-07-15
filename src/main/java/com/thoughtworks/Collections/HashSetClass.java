package com.thoughtworks.Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public
class HashSetClass {
    public static
    void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList("megha","mayur","jack","seema"));
        Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

      HashSet<String> its = new HashSet<>();
        its.addAll(Arrays.asList("megha","maria","jui","lili"));
        System.out.println(its);
        its.retainAll( hashSet);
        System.out.println(its);


    }
}
