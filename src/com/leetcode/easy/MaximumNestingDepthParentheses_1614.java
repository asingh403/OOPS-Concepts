package com.leetcode.easy;

public class MaximumNestingDepthParentheses_1614 {

    public static void main(String[] args) {
        String str = "(1+(2*3)+((8)/4))+1";
        int result  = maxDepth(str);

        System.out.println("Number of valid VPS :: "+ result);
    }

    public static int maxDepth(String s) {
        int max = 0, count = 0;
        for (char c: s.toCharArray()){
            switch(c){
                case '(':
                    ++count;
                    break;
                case ')':
                    // Before decrementing count, record the max opening parantheses.
                    max = Math.max(max, count);
                    --count;
                    break;
            }
        }
        return max;
    }
}
