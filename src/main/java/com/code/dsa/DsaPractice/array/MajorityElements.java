package com.code.dsa.DsaPractice.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElements {
    public static List<Integer> majorityElement(int[] arr){
        int n = arr.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            // Iterating over list
            if(list.isEmpty() || list.getFirst() != arr[i]){
                int count = 0;
                for (int j = 0; j < n; j++){
                    if (arr[j] == arr[i]){
                        count++;
                    }
                }
                if(count > (n / 3))
                    list.add(arr[i]);
            }
            if(list.size() == 2)
                break;

        }
        return list;
    }

    // using hashmap n/3
    public static List<Integer> majorityMapElement(int[] arr){
        int n = arr.length;
        List<Integer> list = new ArrayList<>();

        Map<Integer, Integer> mapList = new HashMap<>();

        // least occurance of majority element
        int occurance =  (n / 3) + 1;

        // storing the elements with least occurance
        for(int i = 0; i < n; i++){
            int value = mapList.getOrDefault(arr[i], 0);
            mapList.put(arr[i], value + 1);

            // checking if arr[i] is the majority element
            if(mapList.get(arr[i]) == occurance){
                list.add(arr[i]);
            }
            if(list.size() == 2) break;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {11, 33, 22, 22, 22, 22, 11,11};

        List<Integer> ans = majorityElement(arr);
        System.out.println("The element are: ");
        for(int i = 0; i < ans.size(); i++){
//            System.out.println(ans.get(i) + " ");
        }

        List<Integer> ans1 = majorityMapElement(arr);
        for(int i = 0; i < ans1.size(); i++){
            System.out.println(ans.get(i) + " ");
        }
    }
}
