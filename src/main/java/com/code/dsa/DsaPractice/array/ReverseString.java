package com.code.dsa.DsaPractice.array;

public class ReverseString {
    // basic one
    public static String basicStr(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }
    // using string builder
    public static String reverseBuilder(String str){
        StringBuilder s = new StringBuilder(str);
        String reverse = s.reverse().toString();
        return reverse;
    }
    // using recursion
    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Reversed String: " + reverse(str));
        System.out.println(reverseBuilder(str));
        System.out.println(basicStr(str));
    }
}
