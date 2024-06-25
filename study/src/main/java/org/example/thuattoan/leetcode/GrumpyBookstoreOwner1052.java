package org.example.thuattoan.leetcode;

public class GrumpyBookstoreOwner1052 {

    public static void main(String[] args) {


    }

    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int result = 0;
        for (int i = 0; i < customers.length; i++) {
            if(grumpy[i]==0) result+=customers[i];
        }
        int plus = 0;
        for (int i = 0; i < minutes && i < customers.length; i++) {
            if(grumpy[i]==1) plus += customers[i];
        }

        // owner calm
        int max = plus;
        for (int i = minutes; i < customers.length; i++) {
            if(grumpy[i]==1) plus += customers[i];
            if(grumpy[i-minutes]==1) plus-= customers[i-minutes];
            if(max<plus) max = plus;
        }
        return result + max;
    }
}
