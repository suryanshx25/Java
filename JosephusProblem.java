package com.company;

public class JosephusProblem {
    public static int gunGame(int n,int k){
        if (n==1){
            return 0;
        }
        return (gunGame(n-1,k)+k)%n;
    }

    public static void main(String[] args) {
        System.out.println(gunGame(5,3));
    }
}
