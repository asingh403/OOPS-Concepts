package com.leetcode.easy;

import java.util.Set;

public class RemoveVowelFromString {

    public static String removeVowel(String s){
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        String res = "";
        for(int i=0; i<s.length(); i++){
            if(!vowels.contains(s.charAt(i))){
                res += s.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "shalini";
        String result = removeVowel(s);

        System.out.println(result);

    }
}
