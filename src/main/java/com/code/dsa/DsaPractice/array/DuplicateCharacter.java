package com.code.dsa.DsaPractice.array;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicateCharacter {
    public static String duplicateChar(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()){
            if(set.add(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> map = new LinkedHashSet<>();
        for (int num : arr) {
            map.add(num);
        }

        // Convert Set back to an array
        return map.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        String input = "programming";
        System.out.println(duplicateChar(input));  // Output: "progamin"
        int[] inpu = {1, 2, 2, 3, 4, 4, 5, 6, 6};
        int[] result = removeDuplicates(inpu);
        System.out.println(Arrays.toString(result));
    }

}
