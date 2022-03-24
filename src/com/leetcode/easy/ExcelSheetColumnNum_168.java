//https://leetcode.com/problems/excel-sheet-column-title/
package com.leetcode.easy;

public class ExcelSheetColumnNum_168 {
    public static String convertToTitle(int columnNumber){

        StringBuilder sb = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int cn = columnNumber%26;
            sb.insert(0, (char)(cn + 'A'));
            columnNumber = columnNumber/26;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
}
