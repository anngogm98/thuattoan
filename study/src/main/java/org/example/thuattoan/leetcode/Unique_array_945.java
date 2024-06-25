package org.example.thuattoan.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unique_array_945 {

    public static void main(String[] args) {
        System.out.println(minIncrementForUnique(new int[] {1,1,1,3,4,6,7}));
    }

    public static int minIncrementForUnique(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int count = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==nums[i-1]) {
                l.add(nums[i]);
                continue;
            }
            int nextVal = nums[i-1] + 1;
            if (nextVal<nums[i]&&l.size()>0) {
                int temp;
                do {
                    temp = l.remove(0);
                    count = count + nextVal-temp;
                    nextVal++;
                } while (nextVal<nums[i] && l.size()>0);
            }
        }
        if(l.size()>0) {
            for (int i = 1; i <= l.size(); i++) {
                count = count + i + nums[nums.length-1]-l.get(i-1);
            }
        }
        return count;
    }
}
