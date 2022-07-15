package com.thoughtworks.Collections;

import java.util.*;

public
class CollectionArrayList {
    public static
    void main(String[] args) {
        List<Integer> list = new ArrayList<>();

//        for(int i=10;i<=10;i=i+10){
//            list.add(i);
//        }
//        System.out.println(list);
//
//        list.add(2,111);
//        System.out.println(list);
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);

        Collections.sort(list);
        Collections.shuffle(list);
        System.out.println(list);


        List<Integer> megha = new ArrayList<>();
        megha.addAll(list);
        System.out.println(megha);
        System.out.println(list.contains(2));
        System.out.println(list.get(2));
        list.removeAll(megha);
        System.out.println(list);

        list.forEach((e) -> {
            e = e * e;
            System.out.println(e+" ");
        });

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
