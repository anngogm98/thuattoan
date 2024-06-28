package org.example.thuattoan.leetcode;

public class TrappingRainWater42 {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public static int trap(int[] h) {
        int left = 0, right = h.length-1;
        int l = 0, r = h.length-1;
        int result = 0;

        while(left<right-1) {
            if(h[left]<=h[right]) {
                left++;
                if(h[l]>h[left]) {
                    result = result + h[l] - h[left] ;
                } else {
                    l=left;
                }
            } else {
                right--;
                if(h[right]<h[r]) {
                    result+=(h[r]-h[right]);
                } else {
                    r=right;
                }
            }
        }
        return result;
    }
}
