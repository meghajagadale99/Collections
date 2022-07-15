package com.thoughtworks.Collections;

import java.util.Arrays;
import java.util.List;

public
class ForEach {
    public static
    void main(String[] args) {
        List<Integer> demo = Arrays.asList(1,2,3,4,5);
//External loops

        for(int i =0;i< demo.size();i++){
            System.out.println(demo.get(i));
        }
        for (int value: demo) {
            System.out.println(value);
        }
//Internal loops
        demo.forEach(value -> System.out.println(value));
    }
}
