class ReverseLL{
  public ListNode reverseList(ListNode head) {
        // code here
        ListNode curr=head, prev=null;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        } 
        return prev;
    }
}
