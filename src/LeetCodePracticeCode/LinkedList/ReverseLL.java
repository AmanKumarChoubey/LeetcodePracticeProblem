class ReverseLL{
  public ListNode reverseList(ListNode head) {
        // code here
        // ListNode curr=head, prev=null;
        // while(curr!=null){
        //     ListNode nextNode=curr.next;
        //     curr.next=prev;
        //     prev=curr;
        //     curr=nextNode;
        // } 
        // return prev;

        // Implement with Recursion
        return solver(head,null);
    }
  public ListNode solver(ListNode  curr, ListNode prev){
        if(curr==null) 
           return prev;

        ListNode nextNode=curr.next;
        curr.next=prev;
        return solver(nextNode,curr);
    }
}
