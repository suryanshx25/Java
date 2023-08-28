package com.company;

import java.util.Scanner;

public class DynamicProgramming {
    public static int Fib(int n){
        if(n==0 || n==1){
            return n;
        }
        System.out.println("Hello " + n);
        return Fib(n-1) + Fib(n-2);
    }
    public static int FibMemoized(int n,int []qb){  //memoization in dp
        if(n==0 || n==1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        System.out.println("Hello " + n);
        int fibnm1 = FibMemoized(n-1,qb);
        int fibnm2 = FibMemoized(n-2,qb);
        int Nfib = fibnm1+fibnm2;

        qb[n] = Nfib;  // storing the return value of nfib in the array qb
        return Nfib;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(Fib(n));
        int dp = FibMemoized(n,new int[n+1]);
        System.out.println(dp);
    }
}
