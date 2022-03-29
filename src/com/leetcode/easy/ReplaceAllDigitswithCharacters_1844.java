//https://leetcode.com/problems/replace-all-digits-with-characters/
package com.leetcode.easy;

public class ReplaceAllDigitswithCharacters_1844 {

    public static String replaceDigits(String s) {
        char[] charArray = s.toCharArray();
        for(int i = 1; i < charArray.length; i = i + 2) {
            charArray[i] = shift(charArray[i - 1], charArray[i]);
        }
        return String.valueOf(charArray);
    }

    static char shift(char letter, char number){
        int increment = Character.getNumericValue(number);
        int asciiCode = (int)letter;
        return (char)(asciiCode + increment);
    }

    public static void main(String[] args) {
        String s = "a1c1e1";
        String result = replaceDigits(s);

        System.out.println(result);
    }
}
