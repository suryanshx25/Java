package com.company;

import java.util.Scanner;

public class DuplicateElementsInAnArray {  //BRUTE FORCE METHOD To find duplicate elements in an array
    public static void main(String[] args) {

        int [] arr = {1,4,2,5,2,6,3,9};
        for (int i = 0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i]==arr[j] && i!=j){
                    System.out.print(arr[j] +" ");
                }
            }
        }
    }
}
