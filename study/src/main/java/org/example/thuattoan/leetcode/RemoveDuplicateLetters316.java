package org.example.thuattoan.leetcode;

import java.util.List;

public class RemoveDuplicateLetters316 {
    public static void main(String[] args) {
        System.out.println(getResult(new int[][]{{2},{1,6},{0,3,5,7},{4}}, 0,0));
    }

    public static String removeDuplicateLetters(String s) {
        int[] temp = new int [26];
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(temp[c[i]-97]==0) temp[c[i]-97]= i;
        }
        for (int i = 0; i < temp.length; i++) {

        }
        return null;
    }

    static String getResult(int[][] arr, int start, int leastIndex) {
        return  null;
    }
}
