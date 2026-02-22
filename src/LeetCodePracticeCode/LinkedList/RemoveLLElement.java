class RemoveLLElement{
   public ListNode removeElements(ListNode head, int val) {
        // code here
        // Through itration
        // while(head!=null && head.val==val) head=head.next;
        // ListNode temp=head;
        // while(temp!=null && temp.next!=null){
        //     if(temp.next.val==val){
        //         temp.next=temp.next.next;
        //     }
        //     else
        //         temp=temp.next;
        // }
       
        // return head;

      // Through Recursive Approa
      if(head==null) return head;

        ListNode temp=removeElements(head.next,val);
        if(head.val==val){
            return temp;
        }
        else{
            head.next=temp;
            return head;
        }
   }
}
