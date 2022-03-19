package com.leetcode.easy;

public class Pangaram {

    public static boolean checkIfPangram(String s) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<26;i++) {
            char ch = alpha.charAt(i);
            if(s.indexOf(ch) == -1)
                return false;
            }
         return true;
        }

    public static void main(String[] args) {
        String input = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(input));
    }
}
