package org.example.thuattoan.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindtheWinneroftheCircularGame1823 {
    public static void main(String[] args) {
        System.out.println(c2(5,3));
    }

    public static int findTheWinner(int n, int k) {
        boolean[] arr = new boolean[n];
        int curr = 1;
        int count = 0;
        while (count<n-1) {
            count++;
            int temp = curr;
            while (arr[curr-1]) {
                curr++;
                if(curr>n) curr=curr-n;
            }
            curr=curr+k-1>n?curr+k-1-n:curr+k-1;
            arr[curr-1]=true;

        }
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i]) return i+1;
        }
        return -1;
    }

    public static int c2(int n, int k) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(i+1);
        }
        int curr = 1;
        while(l.size()>1) {
            curr=(curr+k-1)>n?curr+k-n-1:curr+k-1;
            l.remove(Integer.valueOf(curr));
        }
        return l.get(0);
    }
}
