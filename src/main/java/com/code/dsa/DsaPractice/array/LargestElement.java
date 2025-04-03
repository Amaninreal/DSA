package com.code.dsa.DsaPractice.array;

public class LargestElement {
    public static int largestElement(int[] arr){
        if(arr ==null || arr.length == 0){
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int max = Integer.MIN_VALUE;
        for (int num : arr){
//            if(num > max){
//                max = num;
//            }
            max = Math.max(max, num);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -3, -1, -9, -18, -16};
        System.out.println(largestElement(arr));
    }
}
