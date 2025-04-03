package com.code.dsa.DsaPractice.array;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] arr){
        if (arr == null || arr.length <= 1) {
            return;
        }
//        int left = 0, right = arr.length - 1;
//        while (left < right){
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
        for (int left = 0, right = arr.length - 1; left < right; left++, right--){
            arr[left] ^= arr[right]; // a = a ^ b
            arr[right] ^= arr[left]; // b = b ^ a
            arr[left] ^= arr[right]; // a = a ^ b
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6, 5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
