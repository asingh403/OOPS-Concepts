package com.leetcode.easy;

public class LengthofLastWord {

    public static int lengthOfLastWord(String s){

        String [] str = s.split(" ");

        int res = str[str.length-1].length();

        return res;

    }

    public static void main(String[] args) {

        String s = "Hello World";
        int result = lengthOfLastWord(s);
        System.out.println(result);

    }
}
