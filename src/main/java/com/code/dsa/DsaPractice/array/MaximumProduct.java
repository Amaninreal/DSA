package com.code.dsa.DsaPractice.array;

import java.util.Arrays;

public class MaximumProduct {
    public static int maxProd(int[] arr){
        int n = arr.length;
        // sort an array
        Arrays.sort(arr);
        return Math.max(arr[0] * arr[1] * arr[n - 1], arr[n -1] * arr[n - 2] * arr[n - 3]);
    }

    public static int optimalMaxProd(int[] arr){
        int n = arr.length;

        // initializing Max, Second max, or third max
        int maxA = Integer.MIN_VALUE, maxB= Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;

        // initializing the min value
        int minA = Integer.MAX_VALUE, minB = Integer.MAX_VALUE;

        for(int i = 0; i < n; i ++){
            // updating first, second & third max
            if(arr[i] > maxA){
                maxC = maxB;
                maxB = maxA;
                maxA = arr[i];
            } else if (arr[i] > maxB) {
                maxC = maxB;
                maxB = arr[i];
            } else if (arr[i] > maxC){
                maxC = arr[i];
            }

            // updating min values
            if(arr[i] < minA){
                minB = minA;
                minA = arr[i];
            } else if (arr[i] < minB){
                minB = arr[i];
            }
        }
        return Math.max(minA * minB * maxA, maxA * maxB * maxC);
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 3, 4, 6};
        int max = maxProd(arr);
        System.out.println(max);

        System.out.println(optimalMaxProd(arr));
    }
}
