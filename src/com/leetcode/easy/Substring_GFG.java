//https://practice.geeksforgeeks.org/problems/5ef42ba605fff6cd60b1b2dd2ee230ade1fa25b0/1
package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Substring_GFG {
    public static List<String> minRepeats(String s){
        char startC = s.charAt(0);
        int startR = s.charAt(1) - '0';

        char endC = s.charAt(3);
        int endR = s.charAt(4) - '0';

        List<String> ans = new ArrayList<>();
        for(char c = startC; c<=endC;){
            for (int i=startR;i<=endR;i++){
                ans.add(c+" "+i);
            }
            c = (char)(c+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String A = "A2:F1";
        //String B = "cdabcdab";
        System.out.println(minRepeats(A));
    }
}
