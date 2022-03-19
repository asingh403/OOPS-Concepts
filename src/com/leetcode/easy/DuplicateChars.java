package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChars {
    public static void duplicateWord(String str){
        int n = str.length();
        char chr;
        int i;

        Set<Character> ch = new HashSet<>();

        for(i=0; i<n; i++){
            chr = str.charAt(i);
            if(!ch.add(chr)){
                chr = str.charAt(i);
                System.out.println(chr);
            }
        }
    }

    public static void main(String[] args) {
        String s = "beautiful beach";
        duplicateWord(s);
    }
}
