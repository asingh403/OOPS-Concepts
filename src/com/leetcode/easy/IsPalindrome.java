package com.leetcode.easy;

public class IsPalindrome {


    public static boolean isPalindrome(int num){

        if(num<0 || num == 0) return false;

        int x = num;
        int res = 0;

        while (num>0){
            res = res*10 + num%10;
            num = num/10;
        }

        if(x== res){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int n = 0;
        System.out.println(isPalindrome(n));
    }
}
