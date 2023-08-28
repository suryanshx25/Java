package com.company;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0;i<n;i++){
            for (int j = 0;j<=i;j++){
                System.out.print("*\t");
            }
            int spaces = 2*(n-i);
            for (int j = 0;j<=spaces;j++){
                System.out.print("\t");
            }
            for (int j = 0;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

        for (int i = n;i>=0;i--){
            for (int j = 0;j<=i;j++){
                System.out.print("*\t");
            }
            int spaces = 2*(n-i);
            for (int j = 0;j<=spaces;j++){
                System.out.print("\t");
            }
            for (int j = 0;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
