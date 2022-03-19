package com.leetcode.easy;

public class MaximumNumberOfWords {
    public static int mostWordsFound(String[] sentences) {
        int max =0;

        for(String s: sentences){
            String[] substr = s.split(" ");

            max=Math.max(max, substr.length);
        }
        return max;
    }

    public static void main(String[] args) {
        String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        System.out.println(mostWordsFound(sentences));
    }
}
