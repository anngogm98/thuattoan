package org.example.thuattoan.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DailyTemperatures739 {
    public static void main(String[] args) {
//        var a = dailyTemperatures(new int[] {73,74,75,71,69,72,76,73});
        var a = dailyTemperatures(new int[] {1,1,2,2,1,1,3,3,2,2});
//        for (int j : a) {
//            System.out.println(j);
//        }
    }

    public static int[] dailyTemperatures(int[] t) {
        int[] result = new int[t.length];
        int[] temp = new int[t.length];
        List<NhietDo> list = new ArrayList<>();
        for (int i = 1; i < t.length; i++) {
            list.add(new NhietDo(i, t[i]));
        }
        list.sort((a,b) -> b.v-a.v);
        for (int i = 0; i < t.length; i++) {
            NhietDo nd = list.get(i);

        }
        return new int[1];
    }
    static class NhietDo {
        int index;
        int v;
        public NhietDo(int id, int v) {
            this.index=id;this.v=v;
        }
    }

    // ! Limit Time
    public static int[] cachBasic(int[] t) {
        int[] result = new int[t.length];
        for (int i = 0; i < t.length-1; i++) {
            int temp = i;
            while(temp<t.length-1 && result[i] == 0) {
                temp++;
                if(t[temp]>t[i]) result[i] = temp-i;
            }
        }
        return result;
    }
}
