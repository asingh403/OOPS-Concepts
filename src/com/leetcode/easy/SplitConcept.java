//https://www.techiedelight.com/find-occurrences-of-substring-string-java/
package com.leetcode.easy;

import java.util.Arrays;

public class SplitConcept {
    public static int splitTest(String s, String find){
        String st = s.toLowerCase();

        if(s.isEmpty() || find.isEmpty()) {
            return 0;
        }
        else{
            String [] output = (st.split(find, -1));
            System.out.println(Arrays.toString(output));
            return st.split(find, -1).length-1;
        }
    }

    public static void main(String[] args) {
        String str = "This is my country Indonesia is is";
        String find = "is";
        System.out.println(splitTest(str, find));
    }
}
