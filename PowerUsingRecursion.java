package com.company;

public class PowerUsingRecursion {
    public static int pow(int a,int b){
        if (b==0){
            return 1;
        }
        return a * pow(a,b-1);   //For Example ---> 3 * 3^3 if a = 3 and b = 4
    }
    public static void main(String[] args) {
        System.out.println(pow(3,4));
    }
}
