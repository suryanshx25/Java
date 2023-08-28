package com.company;

public class SubstringOfAString {
    public static void main(String[] args) {

        String s = "abcd";
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
