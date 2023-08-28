package com.company;

import java.util.Scanner;

public class RotatedHalfTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=n-i;j++){
                System.out.print("\t");
            }
            for (int j = i;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}