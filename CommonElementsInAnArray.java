package com.company;

import java.util.HashSet;

public class CommonElementsInAnArray {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {5,6,7,8,9};

        for (int i = 0;i<arr1.length;i++){
            for (int j = 0;j< arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    set.add(arr2[j]);
                }
            }
        }
        System.out.println(set);


    }
}
