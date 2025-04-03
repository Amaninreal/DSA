package com.code.dsa.DsaPractice.practice;

public class CompressString {
    public static String compressCount(String str){
        StringBuilder compress = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++){
            if(i + 1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                count++;
            }
            else {
                compress.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        return compress.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbccccdddd";
        System.out.println(compressCount(str));
    }
}

