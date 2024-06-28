package org.example.thuattoan.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindPositiveIntegerSolutionforaGivenEquation1237 {

    public static void main(String[] args) {

    }

    public static List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        int x = 1, y = 1;
        List<List<Integer>> result = new ArrayList<>();

        while(customfunction.f(x,y) <= z) {
            while(customfunction.f(x,y)<=z) {
                if(customfunction.f(x,y)==z) result.add(List.of(x,y));
                y++;
            }
            x++;y=1;
        }
        return result;
    }
}

class CustomFunction {
    public int f(int x, int y) {
        return x+y;
    }
}
