package com.thoughtworks.Collections;

import java.util.Enumeration;
import java.util.Spliterator;
import java.util.Vector;
import java.util.stream.Stream;

public
class VectorClass {
    public static
    void main(String[] args) {
        //Create an empty vector object
        Vector<String> vc = new Vector<String>();
        //Adding elements to the vector
        vc.add("Tiger");
        vc.add("Deer");
        vc.add("Dog");
        vc.add("Camel");
        Stream<String> str = vc.stream();
        System.out.println(str);
//        Spliterator<String> splitr1 = str.spliterator();
//        splitr1.forEachRemaining((n) -> System.out.println(n));

//        System.out.println("Original vector: "+vc);
//        System.out.println("clone:" + vc.clone());
//        vc.addElement("Hello");
//        System.out.println(vc);
//        for (String num:vc) {
//            System.out.println(num);
//        }
//        Integer[] a = new Integer[5];
//        vc.copyInto(a);
//        for (Integer number: a) {
//            System.out.println(number);
//        }
//        Vector<Integer> vm = new Vector<>();
//        vm.add(1);
//        vm.add(2);
//        vm.add(3);
//        vm.forEach(System.out::println);
//        Enumeration<Integer> objectEnumeration = vm.elements();
//        while (objectEnumeration.hasMoreElements()){
//            System.out.println("enumeration: "+objectEnumeration.nextElement());
//        }
       // Vector<Integer> vec1 = new Vector<>();
        //Add elements in the Vector1
//        vec1.add(1);
//        vec1.add(2);
//        vec1.add(3);
//        vec1.add(4);
//        vec1.add(2);
        //Create an empty Vec2
//        Vector<Integer> vec2 = new Vector<>();
        //Add elements in the Vector2
//        vec2.add(2);
//        vec2.add(3);
//        //Displaying the Vector elements
//        System.out.println("Values in vector :" +vec1);
//        //use retainAll() method
//        vec1.retainAll(vec2);
//        System.out.println("Values in vector :" +vec1);
    }
}

