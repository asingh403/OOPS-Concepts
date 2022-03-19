package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class ValidNumsInSentence {

    public static int countValidWords(String sent) {

        String [] str = sent.split(" ");
        int res = 0;

        Set<String> st = new HashSet<>();
        for(int i=0; i< str.length;i++){
            if((sent.charAt(i)>=33 && sent.charAt(i) <= 44)){
                res++;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        String sentence = "!this  1-s b8d!";
        int result = countValidWords(sentence);
        System.out.println(result);
    }
}
