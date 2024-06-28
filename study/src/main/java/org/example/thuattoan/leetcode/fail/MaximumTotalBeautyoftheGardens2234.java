package org.example.thuattoan.leetcode.fail;

import java.util.Arrays;

public class MaximumTotalBeautyoftheGardens2234 {
    public static void main(String[] args) {
        int[] t = new int[] {2,2,3,4,5};
        System.out.println(t[0]);
    }

    public long maximumBeauty(int[] flowers, long newFlowers, int target, int full, int partial) {
        int[] temp = Arrays.copyOf(flowers, flowers.length);
        Arrays.sort(flowers);

        int maxId = 0;
        int maxFCount = 0;
        while(newFlowers>0&&maxId<flowers.length) {
            if(newFlowers>=target-flowers[maxId]) {
                newFlowers-=(target-flowers[maxId]);
                flowers[maxId]=target;
                maxId++;
                maxFCount++;
            } else break;
        }
        int minId=flowers.length-1;
        int min = flowers[minId];
        while(newFlowers>0 && minId > 0) {
            if(flowers[minId]==flowers[minId-1]) {
                minId--; continue;
            }

            for (int i = minId; i < flowers.length&&newFlowers>0; i++) {
                int increase = (flowers.length-minId);
                if(newFlowers>increase*(flowers[minId-1]-flowers[minId])) {
                    newFlowers -= increase*(flowers[minId-1]-flowers[minId]);
                    min = flowers[minId-1];
                } else {
                    min+= newFlowers/increase;
                    newFlowers=newFlowers%increase;
                }
            }

        }

        int tempResult = maxFCount*full + min*partial;
        int result = tempResult;

        int id = 0;
        while(maxFCount>1) {

        }

        return result;

    }

    // [5,5maxId,4,3,minId2,2]
    //return newFlowers
    static int[] updateMinFlowers(int[] flowers, int minId, int newFlowers) {
        int min = flowers[flowers.length];
        while(newFlowers>0 && minId > 0) {
            if(flowers[minId]==flowers[minId-1]) {
                minId--; continue;
            }

            for (int i = minId; i < flowers.length&&newFlowers>0; i++) {
                int increase = (flowers.length-minId);
                if(newFlowers>increase*(flowers[minId-1]-flowers[minId])) {
                    newFlowers -= increase*(flowers[minId-1]-flowers[minId]);
                    min = flowers[minId-1];
                } else {
                    min+= newFlowers/increase;
                    newFlowers=newFlowers%increase;
                }
            }

        }
        return new int[] {minId, newFlowers};
    }
}
