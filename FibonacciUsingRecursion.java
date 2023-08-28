package com.company;

import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static int Fib(int n ){
        if(n==0 || n==1){
            return 1;
        }
      int fibnm1 = Fib(n-1);
      int fibnm2 = Fib(n-2);
      int fibn = fibnm1+fibnm2;
      return fibn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fib(n));
    }
}
