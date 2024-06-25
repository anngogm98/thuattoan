package org.example.thuattoan.leetcode;

public class Sum_of_Square_Numbers_633 {

    public static void main(String[] args) {
        System.out.println((int)Math.sqrt(100.9));;
        System.out.println(Math.sqrt(100.9) % 1);;
//        System.out.println(judgeSquareSum(5));
    }

    public static boolean judgeSquareSum(int c) {
        int s = (int) Math.sqrt(c);
        while(s>=0) {
            if (Math.sqrt(c-s*s)%1==0) return true;
            s--;
        }
        return false;
    }

    public static int getCan(int c) {
        return 0;
    }
}
