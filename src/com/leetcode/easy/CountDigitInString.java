package com.leetcode.easy;

public class CountDigitInString {

    public static void countDigit(String str){

        String res = "";
        int digit = 0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)>=48 && str.charAt(i)<=57){

                res += str.charAt(i);
                digit ++;
            }
        }
        System.out.println("total number of digit :: "+ digit+" : "+ "Number : "+res);
    }
    public static void main(String[] args) {
        countDigit("ashutSingh12345JK");
    }
}
