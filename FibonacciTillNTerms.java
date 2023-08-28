package com.company;

import java.util.Scanner;

public class FibonacciTillNTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 1;i<=n;i++){
            int c = a +b;
            a = b;
            b = c;
            System.out.println(c);

        }

    }
}
