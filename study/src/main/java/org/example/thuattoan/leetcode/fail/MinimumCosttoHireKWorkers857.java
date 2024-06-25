package org.example.thuattoan.leetcode.fail;

import java.util.ArrayList;
import java.util.List;

public class MinimumCosttoHireKWorkers857 {
    public static void main(String[] args) {
        System.out.println(mincostToHireWorkers(new int[]{3,1,10,10,1}, new int[]{4,8,2,2,7},3));
    }

    public static double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        List<Worker> list = new ArrayList<>();
        List<Worker> paid = new ArrayList<>();
        for (int i = 0; i < quality.length; i++) {
            list.add(new Worker(quality[i], wage[i]));
        }
        list.sort((a,b)-> a.w-b.w);
        double maxPay = list.get(0).w;
        paid.add(list.get(0));
        k--;
        int id = 1;
        int max = 0;
        while(k>0){
            var worker = list.get(id);
            paid.add(worker);
        }
        return 0;

    }
}

class Worker {
    int q;
    int w;
    double tile; // tien luong / chat luong
    public Worker(int q, int w) {this.q=q;this.w=w;this.tile=w*1.0/q;}
}
