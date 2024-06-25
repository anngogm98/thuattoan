package org.example.thuattoan.leetcode;

import java.util.List;

public class HouseRobber198 {

    public static void main(String[] args) {
//        System.out.println(cach2(new int[]{2,7,9,3,1}));
        System.out.println(cach2(new int[]{4,1,1,4,1,1,4}));
//        System.out.println(rob2(new int[]{4,1,1,4,1,1,4}));
    }

    public static int rob(int[] nums) {
        int[] maxProfit = new int[nums.length];
        maxProfit[0] = nums[0];
        maxProfit[1] = nums[1];
        maxProfit[2] = Math.max(nums[1], nums[0]+nums[2]);

        int max = maxProfit[2];

        for (int i = 3; i < nums.length; i++) {
            maxProfit[i] = nums[i] + Math.max(maxProfit[i-2], maxProfit[i-3]);
            if(max<maxProfit[i]) max = maxProfit[i];
        }

        return max;

    }
    public static int cach2(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        return dp[dp.length-1];
    }

    public static int rob2(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i<n; i++) {
            dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
        }
        return dp[n-1];
    }
}
