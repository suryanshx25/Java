package com.company;

import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int [] arr = {23,3,24,16,4,20,11};

        for (int i = 0;i<arr.length-1;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (i==k-1){
                System.out.println(arr[i]);
            }
        }
    }
}
