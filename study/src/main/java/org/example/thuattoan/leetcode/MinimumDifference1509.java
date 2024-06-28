package org.example.thuattoan.leetcode;

import java.util.Arrays;

public class MinimumDifference1509 {
    public static void main(String[] args) {
        System.out.println(minDifference(new int[]{1,5,0,10,14}));
    }

    public static int minDifference(int[] nums) {
        if(nums.length<=4) return 0;
        Arrays.sort(nums);
        int min = nums[nums.length-1]-nums[3];
        for (int i = 2; i >=0; i--) {
            min=Math.min(nums[nums.length-1+i-3]-nums[i],min);
        }
        return min;
    }
}
