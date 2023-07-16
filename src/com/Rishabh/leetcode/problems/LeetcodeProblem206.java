package src.com.Rishabh.leetcode.problems;

public class LeetcodeProblem206 {
    public ListNode reverseList(ListNode head) {
     ListNode current = head ;
     ListNode nextNode = null;
     while(current !=null){
         ListNode curr1 = current ;
         ListNode pre = current.next;
         current.next = nextNode;
         nextNode = curr1 ;
         current = pre;
     }
     head = nextNode;
     return head;

    }
}
