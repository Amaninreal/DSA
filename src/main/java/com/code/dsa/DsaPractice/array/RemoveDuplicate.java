package com.code.dsa.DsaPractice.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static String compressString(String str){
        StringBuilder compress = new StringBuilder();
        int count = 1;
         for(int i = 0; i < str.length(); i++){
             if(i + 1< str.length() && str.charAt(i) == str.charAt(i+1)){
                 count++;
             } else {
                 compress.append(str.charAt(i)).append(count);
                 count = 1;
             }
         }
         return compress.toString();
    }

    public static String filterConsecutiveRepeats(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        Set<Character> uniqueChars = new LinkedHashSet<>();
        char prevChar = '\0'; // Track the previous character

        for (char c : s.toCharArray()) {
            if (c != prevChar) { // Ignore consecutive duplicates
                if (!uniqueChars.contains(c)) {
                    result.append(c);
                    uniqueChars.add(c);
                } else {
                    // Remove if encountered again after a break
                    int index = result.indexOf(String.valueOf(c));
                    if (index != -1) {
                        result.deleteCharAt(index);
                    }
                }
            }
            prevChar = c;
        }

        return result.toString();
    }

    public static int duplicateArr(int[] arr){
        if(arr.length == 0) return 0;
        int index = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]){
                arr[index++] = arr[i];
            }
        }
        return index;
    }

    public static String removeConsecutiveDuplicates(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if( i == 0 || str.charAt(i) != str.charAt(i - 1)){
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static String removeConsecutiveRepeats(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        char currentChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {  // aabbbcabcbb
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                if (count == 1) {
                    result.append(currentChar);
                }
                currentChar = s.charAt(i);
                count = 1;
            }
        }

        // Process the last group of characters
        if (count == 1) {
            result.append(currentChar);
        }

        return result.toString();
    }

    public static String removeConsecutiveRepeats1(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder result1 = new StringBuilder();
        int n = s.length();
        int i = 0;

        while (i < n) {
            char current = s.charAt(i);
            int j = i + 1;
            // Traverse until the end of the current consecutive group
            while (j < n && s.charAt(j) == current) {
                j++;
            }
            // Append only if the group has exactly one character
            if (j - i == 1) {
                result1.append(current);
            }
            i = j; // Move to the next group
        }

        return result1.toString();
    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 5, 5, 5};
        int len = duplicateArr(arr);
        System.out.println(len);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, len)));

        String input = "aabbbcabcbb";

        String output3 = filterConsecutiveRepeats(input);
        System.out.println(filterConsecutiveRepeats(output3));
        String output = removeConsecutiveDuplicates(input);
        System.out.println(output);

        String output1 = removeConsecutiveRepeats(input);
        System.out.println(output1);

        String output2 = removeConsecutiveRepeats1(input);
        System.out.println(output2);

        String input1 = "aaabbccddd";
        String o3 = compressString(input1);
        System.out.println(o3);

    }
}
