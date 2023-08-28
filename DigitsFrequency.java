package com.company;

import java.util.Scanner;

public class DigitsFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int count = 0;
        while(n>0){
            int digit = n%10;
            n = n/10;

            if (digit == d){
                count++;
            }
        }
        System.out.println(count);
    }
}
