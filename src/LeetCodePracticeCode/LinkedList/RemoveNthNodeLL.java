class RemoveNthNodeLL{
   public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        count-=n;
        if(count==0) return head.next;
        temp=head;
        while(count>1){
            temp=temp.next;
            count--;
        }
        temp.next=temp.next.next;
        return head;
    }
}
