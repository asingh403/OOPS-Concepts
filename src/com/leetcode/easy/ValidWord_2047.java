package com.leetcode.easy;

import java.util.regex.Pattern;

public class ValidWord_2047 {
    public static int countValidWords(String sent) {

        int res = 0;
        Pattern comp = Pattern.compile("(^[a-z]+(-[a-z]+)?)?[,.!]?$");
        //Pattern.compile("(^[a-z]+(-[a-z]+)?)?[,.!]?$");

        for (String word:sent.trim().split("\\s+")){
            if (comp.matcher(word).matches())
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        String sentence = "alice and  bob are playing stone-game10";
        System.out.println(countValidWords(sentence));
    }
}
