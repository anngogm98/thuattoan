package org.example.thuattoan.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Paint_House_256 {

    public static void main(String[] args) {
//        System.out.println(paint(new int[][] {{17,2,17},{16,16,5},{14,3,19}}));
//        System.out.println(paint(new int[][] {{1,2,3},{4,5,6},{11,11,22}}));
//        miniMaxSum(List.of(256741038,623958417,467905213,714532089,938071625));
        miniMaxSum(List.of(1,2,3,4,5));
    }

    static Integer paint(int[][] house) {
        int[] arr = new int[] {256741038,623958417,467905213,714532089,938071625};
        Arrays.stream(arr).sum();
        System.out.printf("%.6f", 123f);
        return null;
    }

    public static void miniMaxSum(List<Integer> arr) {
        List<Double> arr2 = arr.stream().map(i -> i*1.0/5).collect(Collectors.toList());
        System.out.println(arr2);
        // Write your code here
        Double sum = Double.valueOf(arr.stream().reduce(0, (a,b) -> a+b));
        Double max = sum-arr.get(0), min=sum-arr.get(0);

        for (Integer integer : arr) {
            if (max < sum - integer) max = sum - integer;
            if (min > sum - integer) min = sum - integer;
        }

        System.out.printf("%.0f %.0f", min*5, max*5);
    }
}
