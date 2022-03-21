//https://leetcode.com/problems/split-a-string-in-balanced-strings/
package com.leetcode.easy;

public class SplitBalancedStrings_1221 {
    public static int balancedStringSplit(String s) {
        int cnt = 0, res = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'L'){
                cnt++;
            }
            else cnt--;
            if(cnt == 0) res++;
        }
        return res;
    }

    public static void main(String[] args) {
    String str = "RLRLL"; //RLRRLLRLRL
    int res= balancedStringSplit(str);
        System.out.println(res);
    }
}
