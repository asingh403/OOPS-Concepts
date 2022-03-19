package com.leetcode.easy;

public class Pangaram {

    public static boolean checkIfPangram(String s) {

        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>=97 && s.charAt(i)<=122) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram("leetcode"));
    }
}
