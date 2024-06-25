package org.example.thuattoan.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Permutations_46 {

    static int count = 0;

    public static void main(String[] args) {
        System.out.println((permute(new int[]{1,2,3})));

    }

        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> list=new ArrayList<>();
            List<Integer> temp=new ArrayList<>();
            helper(list,temp,nums);
            return list;

        }
        public static void helper( List<List<Integer>> list,List<Integer> temp,int[] nums){
            System.out.println(temp);

            if(temp.size()==nums.length){
                list.add(new ArrayList<>(temp));
            }

            for(int i=0;i<nums.length;i++){
                if(temp.contains(nums[i]))continue;
                temp.add(nums[i]);
                helper(list,temp,nums);
                temp.remove(temp.size()-1);
            }
        }
}
