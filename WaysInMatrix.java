package com.company;

public class WaysInMatrix {
    public static int count(int n,int m){
        if (n==1 || m == 1){
            return 1;
        }
        return count(n-1,m )+ count(n,m-1);
    }

    public static void main(String[] args) {
        System.out.println(count(3,4));
    }
}
