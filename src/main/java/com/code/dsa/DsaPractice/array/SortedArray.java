package com.code.dsa.DsaPractice.array;

import java.util.Arrays;

public class SortedArray {
    public static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
    }

    // bubble sort
    public static void sortedArr(int[] arr){
        for(int i = 0; i < arr.length - 1 ; i++){
            for (int j = 1; j < arr.length - i; j++){
                if (arr[j] < arr[j - 1]){//    3, 1 ->
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                 }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 3, 2, 1};
        System.out.println(isSorted(arr));
        sortedArr(arr);
        System.out.println(Arrays.toString(arr));

    }
}
