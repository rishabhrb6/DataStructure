package src.com.Rishabh.leetcode.problems;

/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
https://leetcode.com/problems/remove-nth-node-from-end-of-list
 */
public class LeetcodeProblem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head ;
        int k = 0;
        while(current != null){
            current = current.next ;
            k++ ;
        }
        int i = 0;
        ListNode current1 = head ;
        if(k - n == 0){
            if(head.next != null){
                head = head.next;
                return head ;
            }
            else if(head.next == null){
                head = null;
                return head ;
            }

        }
        else{
            while(current1 != null){
                if(n == 1 && i== k-n-1){
                    current1.next = null ;
                }
                else if(i == k - n - 1){
                    current1.next = current1.next.next;
                    break;
                }
                current1 = current1.next ;
                i++;
            }

        }
        return head ;

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}



