package com.thoughtworks;

public
class ReverseString {

    public String revString(String actual){
        String reverse = " ";
        for(int i = actual.length();i>0;i--){
            reverse=reverse+actual.charAt(i-1);
        }return reverse;
    }

    public static
    void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String str="megha";
        System.out.println(reverseString.revString(str));

    }
}
