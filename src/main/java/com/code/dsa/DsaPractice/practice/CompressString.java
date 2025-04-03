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

    public static String uniqueCompressString(String str){
        StringBuilder map = new StringBuilder();
        char currentChar = str.charAt(0);
        int count = 1;
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i)== currentChar){
                count++;
            }
            else {
                if(count == 1){
                    map.append(currentChar);
                }
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        if(count == 1){
            map.append(currentChar);
        }
        return map.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbccccabcaddddd";
        System.out.println(compressCount(str));
        System.out.println(uniqueCompressString(str));
    }
}

