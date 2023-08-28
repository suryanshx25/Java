package com.company;

public class EuclidGCD {
    public static int gcd(int a , int b){
        if (b==0){   //base case
            return a;
        }else{
            return gcd(b,a%b);   //Using Recursion or Recursive call
        }
    }
    public static void main(String[] args) {
        System.out.println(gcd(24,36));

    }
}
