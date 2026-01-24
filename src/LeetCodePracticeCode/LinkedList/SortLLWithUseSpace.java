class SortLLWithUseSpace{
  public ListNode sortList(ListNode head) {
       List<Integer> ans=new ArrayList<>();
       ListNode dummy=head;
       while(dummy!=null){
        ans.add(dummy.val);
        dummy=dummy.next;
       }
       ListNode listCode=new ListNode(0);
       dummy=listCode;
       Collections.sort(ans);
       for(int i=0;i<ans.size();i++){
         dummy.next=new ListNode(ans.get(i));
         dummy=dummy.next;
       }
       return  listCode.next;
    }
}
