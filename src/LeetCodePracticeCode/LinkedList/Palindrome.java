class Palindrome{
  public boolean isPalindrome(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        if(n<=1) return true;
        // if(n%2!=0) return false;

        temp=head;
        for(int i=0;i<(n/2);i++){
            temp=temp.next;
        }
        ListNode dummy=solver(temp);
        ListNode t1=head;
        int i=0;
        while(i<(n/2)){
            if(dummy.val!=t1.val) return false;
            dummy=dummy.next;
            t1=t1.next;
            i++;
        }
        return true;
    }
    public ListNode solver(ListNode temp){
        ListNode prev=null, curr=temp;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;
    }
}
