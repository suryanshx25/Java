package com.company;

public class DeletionOfAnArray {
    public static void main(String[] args) {

        int arr[] = {20,30,40,50,60,70};
        int deleteElement = 40;

        for (int i = 0;i<arr.length;i++){
            if (deleteElement==arr[i]){
                for (int j = i;j< arr.length-1;j++){
                 arr[j] = arr[j+1];
                }
                break;
            }
        }
        for (int k = 0;k<arr.length-1;k++){
            System.out.println(arr[k] +" ");
        }
    }

}
