package src.com.Rishabh.leetcode.problems;

/*
Given the head of a linked list, rotate the list to the right by k places.
https://leetcode.com/problems/rotate-list . 
 */
public class LeetcodeProblem61 {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null){
            return null ;
        }
        if(head.next == null){
            return head ;
        }
        int i = 0 ;
        ListNode c = head;
        while(c != null){
            c = c.next;
            i++;
        }

        k = k % i ;

        while(k > 0){
            ListNode curr = head ;
            int nextNode = curr.val;
            while(curr.next != null){
                int nextNode1 = curr.next.val ;
                curr.next.val = nextNode ;
                nextNode = nextNode1;
                curr = curr.next ;
            }
            int nextNode1 = curr.val;
            curr.val = nextNode1 ;
            head.val = nextNode;

            k--;
        }

        return head ;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */