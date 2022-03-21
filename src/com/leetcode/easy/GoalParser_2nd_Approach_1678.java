//https://leetcode.com/problems/goal-parser-interpretation/
package com.leetcode.easy;

public class GoalParser_2nd_Approach_1678 {
    public static StringBuilder interpret(String command){
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<command.length()){
            if(command.charAt(i) == 'G' || command.charAt(i) == 'g'){
                sb.append('G');
                i = i+1;
            } else if (command.charAt(i) == '(' && command.charAt(i+1)== ')'){
                sb.append("o");
                i = i+2;
            }else{
                sb.append("al");
                i = i+4;
            }

        }
        return sb;
    }

    public static void main(String[] args) {
        //System.out.println(interpret("(al)G(al)()()G"));
        System.out.println(interpret("G()()gal"));
    }
}
