package com.code.dsa.DsaPractice.array;

public class SecondLargest {
    public static int secondLargest(int[] arr){
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two distinct elements");
        }
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int num : arr){
            if ( num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        if (second == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found (all elements are the same)");
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {6,5, 4,2,1,2,4,1};
        System.out.println(secondLargest(arr));
    }
}
