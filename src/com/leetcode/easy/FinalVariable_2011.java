package com.leetcode.easy;

public class FinalVariable_2011 {
    public static int finalValueAfterOperations(String[] opr) {

        int res = 0;
        for(int i=0; i<opr.length; i++) {
            res += (opr[i].charAt(1) == '+' ? 1 : -1);
        }
        return res;
    }
    public static void main(String[] args) {
        String arr []  = {"--i","i++","i++","i--","++i","i++"};
        System.out.println(finalValueAfterOperations(arr));
    }
}
