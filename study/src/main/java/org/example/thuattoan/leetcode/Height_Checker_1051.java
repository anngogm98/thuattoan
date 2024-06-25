package org.example.thuattoan.leetcode;

import java.util.Arrays;

public class Height_Checker_1051 {

    public static void main(String[] args) {
        String a = "01236";
        System.out.println((a.charAt(1)-'0'));
    }

    public int heightChecker(int[] heights) {
        int[] e = Arrays.stream(heights).sorted().toArray();
        int count = 0;
        for (int i = 0; i< heights.length; i++) {
            if (e[i] != heights[i]) count ++;
        }
        return count;

    }
}
