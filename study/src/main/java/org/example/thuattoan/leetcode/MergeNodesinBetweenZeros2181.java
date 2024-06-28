package org.example.thuattoan.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MergeNodesinBetweenZeros2181 {
    public static void main(String[] args) {
        System.out.println(maxVowels("tryhard",4));
    }

    public static ListNode mergeNodes(ListNode head) {
        ListNode resultHead = new ListNode(0);
        ListNode temp = resultHead;
        head=head.next;
        while(head.next!=null) {
            if(head.val!=0) {
                temp.val+=head.val;
            } else {
                temp.next=new ListNode(0);
                temp=temp.next;
            }
            head = head.next;
        }
        return resultHead;
    }

    public static int maxVowels(String s, int k) {
        char[] c = s.toCharArray();
        int result = 0;
        for (int i = 0; i < k; i++) {
            if(check(c[i])) result++;
        }
        int temp = result;
        for (int i = k; i < c.length - k-1; i++) {
            if(check(c[i])) temp++;
            if(check(c[i-3])) temp--;
            if(result<temp) result=temp;
        }
        return result;
    }
    static List<Character> listChar = List.of('a','e','i','o','u');
    static boolean check(char c) {
        return listChar.contains(c);
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
