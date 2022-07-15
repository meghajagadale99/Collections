package com.thoughtworks.Collections;

import java.util.Iterator;
import java.util.Stack;

public
class StackClass {
    public static
    void main(String[] args) {
        Stack<Integer> st= new Stack<>();
// checking stack is empty or not
        boolean result = st.empty();
        System.out.println("Is the stack empty? " + result);
// pushing elements into stack
        st.push(78);
        st.push(113);
        st.push(90);
        st.push(120);
//prints elements of the stack
//        System.out.println("Elements in Stack: " + st);
//        result = st.empty();
//        System.out.println("Is the stack empty? " + result);
        Iterator iterator = st.iterator();
        while (iterator.hasNext()){
            Object values = iterator.next();
            System.out.println(values);
        }
    }
}
