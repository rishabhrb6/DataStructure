package src.com.Rishabh.leetcode.problems;

/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list.
The list should be made by splicing together the nodes of the first two lists.
https://leetcode.com/problems/merge-two-sorted-lists
 */

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//
//}
public class LeetcodeProblem21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        else if( list1 == null && list2 != null){
            return list2 ;
        }

        else if(list2 == null && list1 != null){
            return list1;
        }

        ListNode result = new ListNode();
        ListNode current = result;
        if(list1.val <= list2.val){
            current.val = list1.val;
            list1 = list1.next ;
        }
        else{
            current.val = list2.val ;
            list2 = list2.next ;
        }

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val) {
                current.next = new ListNode(list1.val);
                current = current.next ;
                list1 = list1.next;
            }
            else if(list1.val > list2.val){
                current.next = new ListNode(list2.val);
                current = current.next ;
                list2 = list2.next;
            }

        }

        while(list1 == null && list2 != null){
            current.next = new ListNode(list2.val);
            current = current.next ;
            list2 = list2.next;
        }
        while(list2 == null && list1 != null){
            current.next = new ListNode(list1.val);
            current = current.next ;
            list1 = list1.next;
        }
        return result ;

    }
}
