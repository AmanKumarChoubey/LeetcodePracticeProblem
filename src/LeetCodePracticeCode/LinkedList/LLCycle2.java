class LLCycle2{
   public ListNode detectCycle(ListNode head) {
        // Use Map as Brute force to check if the node comes previously.

        // To optimised the problem the same approach i use same as Detect Loop in LL and additionally
        // add the concept that set slow at head and start move slow and fast by one step the place
        // where they collide that node from where cycle start.
        if(head==null || head.next==null) return null;
        ListNode slow=head, fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
