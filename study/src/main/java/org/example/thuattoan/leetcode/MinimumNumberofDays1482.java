package org.example.thuattoan.leetcode;

public class MinimumNumberofDays1482 {
    public static void main(String[] args) {
        System.out.println(minDays(new int[]{5,6,7,8,12,7,6,8,4,5,6}, 3, 3));
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        int length = bloomDay.length;
        if(m*k>length) return -1;
        int[] minD = new int[length-k+1];

        for (int i = 0; i < length-k+1; i++) {
            minD[i]=bloomDay[i];
            for (int j = 1; j < k; j++) {
                minD[i]=Math.min(bloomDay[i+j], minD[i]);
            }
        }

        for (int i = 0; i < minD.length; i++) {
            int count = 0;
            int min;
            while(count<m) {

            }
        }
        return 0; //failure
    }
}
