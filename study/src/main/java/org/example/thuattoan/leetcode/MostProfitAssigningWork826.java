package org.example.thuattoan.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MostProfitAssigningWork826 {

    public static void main(String[] args) {
        var d = new int[]{2,4,6,8,10};
        var p = new int[]{10,20,30,40,50};
        var w = new int[]{4,5,6,7};
        System.out.println(cach2(d,p,w));
    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int sum = 0;
        int[] p = new int[worker.length];
        for (int i = 0; i < difficulty.length; i++) {
            for (int j = 0; j < worker.length; j++) {
                if (worker[j]>=difficulty[i] && p[j] < profit[i]) {
                    sum=sum+profit[i]-p[j];
                    p[j] = profit[i];
                }
            }
        }
        return sum;
    }

    public static int cach2(int[] difficulty, int[] profit, int[] worker) {
        List<int[]> jobProfile = new ArrayList<>();
        jobProfile.add(new int[] { 0, 0 });
        for (int i = 0; i < difficulty.length; i++) {
            jobProfile.add(new int[] { profit[i], difficulty[i] });
        }

        // Sort in decreasing order of profit.
        jobProfile.sort((a, b) -> Integer.compare(b[0], a[0]));
        for (int i = 0; i < jobProfile.size() - 1; i++) {
            jobProfile.get(i + 1)[1] = Math.min(
                    jobProfile.get(i)[1],
                    jobProfile.get(i + 1)[1]
            );
        }

        int netProfit = 0;
        for (int i = 0; i < worker.length; i++) {
            int ability = worker[i];
            // Maximize profit using binary search.
            int l = 0, r = jobProfile.size() - 1, jobProfit = 0;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (jobProfile.get(mid)[1] <= ability) {
                    jobProfit = Math.max(jobProfit, jobProfile.get(mid)[0]);
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            // Add profit of each worker to total profit.
            netProfit += jobProfit;
        }
        return netProfit;
    }
}
