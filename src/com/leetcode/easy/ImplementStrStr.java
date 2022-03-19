package com.leetcode.easy;

public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        if (m < n) return -1;
        for (int i = 0; i <= (m-n); ++i) {
            //System.out.println("i :: "+ i);
            int j;
            for (j = 0; j < n; ++j) {
                //System.out.println("j :: " + j);
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
            }
            if (j == n) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "lo";
        System.out.println("Result :: "+ strStr(haystack, needle));
    }
}
