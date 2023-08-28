package com.company;

public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr = {3,66,2,43,16,12,34,23,56};
        int temp = 0;

        for (int i = 0;i<=arr.length;i++){
            for (int j = i+1;j< arr.length;j++){
                if (arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("Second Largest Element : " +arr[1]);
    }
}
