package com.company;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        int returnValue = 0;
        int p = 1;
        while(n>0){
            int digit = n%b;
            n= n/b;

            returnValue = digit * p + returnValue;
            p = p*10;
        }
        System.out.println(returnValue);
    }
}
