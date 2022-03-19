package com.leetcode.easy;

public class FactorialRecursion {
    public static int fact(int nums){
        if(nums ==0) return 1;

        else
            return (nums*fact(nums-1));
    }

    public static void main(String[] args) {

        System.out.println(fact(4));

    }

}
