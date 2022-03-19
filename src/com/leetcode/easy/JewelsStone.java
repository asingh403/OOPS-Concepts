package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class JewelsStone {
    public static int numJewelsInStones(String j, String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            int x = j.indexOf(s.charAt(i));
            if(x!=-1)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String jewels = "cc";
        String stones = "aAAbbbb";
        int res = numJewelsInStones(jewels, stones);
        System.out.println(res);
    }
}
