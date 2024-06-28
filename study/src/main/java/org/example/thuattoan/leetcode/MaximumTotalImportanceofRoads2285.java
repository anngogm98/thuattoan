package org.example.thuattoan.leetcode;

import java.util.Arrays;

public class MaximumTotalImportanceofRoads2285 {
    public static void main(String[] args) {

    }

    public long maximumImportance(int n, int[][] roads) {

        int[] temp = new int[n];
        for (int[] road: roads) {
            temp[road[0]]++;
            temp[road[1]]++;
        }
        Arrays.sort(temp);
        long result = 0;
        int t = 1;
        for (int i = 0; i < temp.length; i++) {
            result+= ((long) temp[i]) *t++;
        }

        return result;
    }
}
