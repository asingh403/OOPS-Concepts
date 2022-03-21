//https://leetcode.com/problems/goal-parser-interpretation/
package com.leetcode.easy;


public class GoalParser_1678 {
    public static void interpret(String command){
        String replaceString = command.replace("()", "o");
        String ans = replaceString.replace("(al)", "al");
        System.out.println(replaceString);
        System.out.println(ans);


    }

    public static void main(String[] args) {
        interpret("(al)G(al)()()G");

    }
}
