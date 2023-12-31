package com.company;
import java.io.*;
import java.util.Scanner;

public class SpiralTraversal {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        int tne  = n * m;
        int minr = 0;
        int minc = 0;
        int maxr = n - 1;
        int maxc = m - 1;
        while(cnt < tne){
            for(int i = minr; i <= maxr && cnt < tne; i++){
                System.out.println(arr[i][minc]);
                cnt++;
            }
            minc++;

            for(int j = minc; j <= maxc && cnt < tne; j++){
                System.out.println(arr[maxr][j]);
                cnt++;
            }
            maxr--;

            for(int i = maxr; i >= minr && cnt < tne; i--){
                System.out.println(arr[i][maxc]);
                cnt++;
            }
            maxc--;

            for(int j = maxc; j >= minc && cnt < tne; j--){
                System.out.println(arr[minr][j]);
                cnt++;
            }
            minr++;

        }
    }

}