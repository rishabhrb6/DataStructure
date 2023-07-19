package src.com.Rishabh.leetcode.problems;

/*
You are given the head of a singly linked-list. The list can be represented as:
L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:
L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 */
public class LeetcodeProblem143 {

    public void reorderList(ListNode head) {
       ListNode current= head ;
       while(current != null && current.next != null && current.next.next != null) {
               ListNode cur = current.next;
               ListNode cur1 = current;
               while (cur.next != null) {
                   cur1 = cur ;
                   cur = cur.next;
               }
               cur.next = current.next;
               current.next = cur;
               cur1.next = null;
           current = current.next.next;
       }

    }
}
