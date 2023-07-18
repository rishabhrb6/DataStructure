package src.com.Rishabh.leetcode.problems;

public class LeetcodeProblem82Optimised {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null ;
        ListNode cur = head ;
        while(cur != null && cur.next != null){

            if(cur.val == cur.next.val){
                int check = cur.val;
                while(cur !=null && check == cur.val){
                    cur = cur.next;
                }

            }
            else{
                if(prev == null){
                    head = cur ;
                    prev = cur;
                }
                else{
                    prev.next = cur;
                    prev = prev.next;
                }

                cur = cur.next ;
            }
        }
        if(prev == null){
            head = cur ;

        }
        else{
            prev.next = cur;

        }
        return head ;
    }
}
