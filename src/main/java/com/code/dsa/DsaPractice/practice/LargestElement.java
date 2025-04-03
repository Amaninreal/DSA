package com.code.dsa.DsaPractice.practice;

public class LargestElement {
    public static int largeElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            max = Math.max(max, num);
        }
        return max;
    }
    public static int smallerElement(int[] arr){
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int num : arr){
            if( num > first){
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(largeElement(arr));
        System.out.println(smallerElement(arr));
    }
}
