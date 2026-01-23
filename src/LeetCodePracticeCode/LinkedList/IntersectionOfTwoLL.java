class IntersectionOfTwoLL{
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Set<ListNode> set=new HashSet<>();
        // ListNode tempA=headA, tempB=headB;
        // while(tempA!=null){
        //     set.add(tempA);
        //     tempA=tempA.next;
        // }
        // while(tempB!=null){
        //     if(set.contains(tempB)){
        //         return tempB;
        //     }
        //     tempB=tempB.next;
        // }
        // return null;
        ListNode d1=headA;
        ListNode d2=headB;
        while(d1!=d2){
            d1=d1==null ? headB:d1.next;
            d2=d2==null ? headA:d2.next;
        }
        return d1;
    }
}
