package org.example.thuattoan.leetcode.fail;

public class MinimumNumberofKConsecutiveBitFlips995 {
    public static void main(String[] args) {
//        System.out.println(minKBitFlips(new int[]{0,1,0}, 1));
//        System.out.println(minKBitFlips(new int[]{1,1,0}, 2));
//        System.out.println(cach2(new int[]{0,0,0,1,0,1,1,0}, 3));
        System.out.println(cach2(new int[]{0,1,0,1,0,1,0,1,0,1,0}, 3));
    }

    public static int minKBitFlips(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length-k+1; i++) {
            if(nums[i]==0) {
                count++;
                for (int j = i; j < i+k; j++) {
                    nums[j]=1-nums[j];
                }
            }
        }
        for (int i = nums.length-k; i < nums.length; i++) {
            if(nums[i]==0) return -1;
        }
        return count;
    }
    public static int cach2(int[] nums, int k) {
        // Keeps track of flipped states
        boolean[] flipped = new boolean[nums.length];
        // Tracks valid flips within the past window
        int validFlipsFromPastWindow = 0;
        // Counts total flips needed
        int flipCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                // Decrease count of valid flips from the past window if needed
                if (flipped[i - k]) {
                    validFlipsFromPastWindow--;
                }
            }

            // Check if current bit needs to be flipped
            if (validFlipsFromPastWindow % 2 == nums[i]) {
                // If flipping the window extends beyond the array length, return -1
                if (i + k > nums.length) {
                    return -1;
                }
                // Increment the count of valid flips and mark current as flipped
                validFlipsFromPastWindow++;
                flipped[i] = true;
                flipCount++;
            }
        }

        return flipCount;
    }
}
