package org.example.thuattoan.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Largest_Divisible_Subset_368 {

    public static void main(String[] args) {
//        System.out.println(largestDivisibleSubset(new int[] {1,2,4,5,8}));
        System.out.println(cachDung(new int[] {5,9,18,54,108,540,90,180,360,720}));
    }

    // Sai nums = [5,9,18,54,108,540,90,180,360,720]
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(list.size()==0) {
                List<Integer> l = new ArrayList<>();
                l.add(nums[i]);
                list.add(l);
                continue;
            }

            boolean added = false;
            if(nums[i]==1) list.forEach(l -> l.add(0, 1));
            for (List<Integer> l : list) {
                if(l.get(l.size()-1)%nums[i]==0 || nums[i]%l.get(l.size()-1)==0) {
                    added = true;
                    if(l.get(l.size()-1) < nums[i]) {
                        l.add(nums[i]);
                    } else l.add(0, nums[i]);
                }
            }
            if(!added) {
                List<Integer> l = new ArrayList<>();
                l.add(nums[i]);
                list.add(l);
            }

        }

        List<Integer> max = new ArrayList<>();
        for (List<Integer> l:list) {
            if(max.size()<l.size()) max=l;
        }
        return max;
    }

    public static List<Integer> cach2(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(nums[0]));

        for (int i = 1; i < nums.length; i++) {
            List<List<Integer>> temp = new ArrayList<>();
            boolean added = false;
            for (List<Integer> l: list){
                if(l.get(l.size()-1)%nums[i]==0 || nums[i]%l.get(l.size()-1)==0) {
                    List<Integer> newL = new ArrayList<>(l);
                    newL.add(nums[i]);
                    temp.add(newL);
                    added = true;
                }
            }
            if (!added) {
                List<Integer> add = new ArrayList<>();
                add.add(nums[i]);
                list.add(add);
            }
            list.addAll(temp);
        }
        List<Integer> max = new ArrayList<>();
        for (List<Integer> l:list) {
            if(max.size()<l.size()) max=l;
        }
        return max;
    }

    public static List<Integer> cachDung(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        Arrays.sort(nums);
        int[] hash = new int[nums.length];
        int maxi = -1;
        int lastIndex = 0;
        for(int index=0;index<nums.length;index++){
            hash[index] = index;
            for(int col=0;col<index;col++){

                if(nums[index]%nums[col]==0 && 1 + dp[col] > dp[index]){
                    dp[index] = 1 + dp[col];
                    hash[index] = col;
                }
            }
            if(dp[index]>maxi){
                maxi = dp[index];
                lastIndex = index;
            }
        }
        List<Integer> lst = new ArrayList<>();
        lst.add(nums[lastIndex]);
        while(hash[lastIndex]!=lastIndex){
            lastIndex = hash[lastIndex];
            lst.add(nums[lastIndex]);


        }
        return lst;
    }
}
