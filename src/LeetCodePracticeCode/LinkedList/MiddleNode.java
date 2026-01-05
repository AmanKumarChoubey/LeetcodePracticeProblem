package LeetCodePracticeCode.LinkedList;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        //code here.
        //TortoiseHare Method
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
