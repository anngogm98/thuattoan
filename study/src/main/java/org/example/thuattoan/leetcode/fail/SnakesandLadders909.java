package org.example.thuattoan.leetcode.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SnakesandLadders909 {
    public static void main(String[] args) {

    }

    public static int snakesAndLadders(int[][] board) {
        int n = board.length;

        int max = -1;
        int lastCurr = n*n;
        int index = n*n;
        int step = 0;

        int col = n, row = n;
        int maxCurr = n*n;

        while(col>=0) {
            while(row>=0) {

                row--;
            }
            col--;
            row = n;
        }
        List<Integer> l = new ArrayList();
         int[] i = l.stream().mapToInt(Integer::intValue).toArray();
        return 0;
    }

    static int getValAtAddress(int curr, int[][] board) {
        return board[curr/ board.length][curr % board.length];
    }
}
