package com.thoughtworks.Collections;

interface A {
    void show();
}
//class Demo implements A{
//
//    @Override
//    public
//    void show() {
//        System.out.println("Hello");
//    }
//}
public
class LambdaExpression {
    public static
    void main(String[] args) {
        A obj;
        obj = new A(){
            @Override
            public
            void show() {
                System.out.println("Hello");
            }
        };

    }
}
