package org.example.thuattoan;

import java.util.Arrays;

public class BagofTokens948 {
    public static void main(String[] args) {
//        System.out.println(bagOfTokensScore(new int[]{48,87,26}, 81));
//        System.out.println(bagOfTokensScore(new int[]{100,200,300,400}, 200));
//        System.out.println(bagOfTokensScore(new int[]{58,91}, 50));
//        System.out.println(bagOfTokensScore(new int[]{71,55,82}, 54));
        System.out.println(bagOfTokensScore(new int[]{10}, 10));
    }

    public static int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length==0) return 0;
        if(tokens.length==1) {
            return power>tokens[0]?1:0;
        }
        Arrays.sort(tokens);
        int score = 0;
        int start = 0, end = tokens.length-1;
        while(start<=end) {
            while(power>=tokens[start]) {
                power-=tokens[start];
                score++;start++;
            }
            if(start>=end||score==0) break;
            power+=tokens[end];
            score--;end--;
        }
        return score;
    }

    public int cachsai(int[] tokens, int power) {
        if(tokens.length==0) return 0;
        Arrays.sort(tokens);
        if(power<tokens[0]) return 0;
        int score = 1;
        power-=tokens[0];
        int end = tokens.length-1;
        int start = 1;
        while (start<end) {
            power+=tokens[end];
            end--;
            score--;

            while(start<=end&&power>=tokens[start]) {
                power-=tokens[start];
                score++;
                start++;
            }
        }
        return score;
    }
}
