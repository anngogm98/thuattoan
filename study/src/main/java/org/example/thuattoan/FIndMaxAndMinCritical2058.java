package org.example.thuattoan;

public class FIndMaxAndMinCritical2058 {
    public static void main(String[] args) {
        int[] arr = new int[]{9,8,4,8,9,8};
        ListNode head , pre;
        head = new ListNode(arr[0]);
        pre=head;
        for (int i = 1; i < arr.length; i++) {
            pre.next = new ListNode(arr[i]);
            pre=pre.next;
        }

        System.out.println(nodesBetweenCriticalPoints(head)[1]);
    }

    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        int max=-1,min=-1,temp=-1;
        int i=head.val-head.next.val;
        head=head.next;
        while(head.next!=null) {
            temp++;
            if(checkCritical(head, i)) {
                if(max==-1||min==-1) {
                    max=min=0;
                } else {
                    max+=temp;
                }
                if(min==0||min>temp) min=temp;
                temp=0;
            }
            i=head.val-head.next.val;
            head=head.next;
        }
        if(max==0||min==0) return new int[]{-1,-1};
        return new int[]{min,max};
    }

    static boolean checkCritical(ListNode node, int i) {
        if(i==0||node.val==node.next.val) return false;
        if(node.val<node.next.val&&i>0) return true;
        if(node.val>node.next.val&&i<0) return true;
        return false;
    }

    public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
