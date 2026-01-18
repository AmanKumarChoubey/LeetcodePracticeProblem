package LeetCodePracticeCode.Stack;

import java.util.Stack;

public class NextGreaterEle1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // code here.
//        These are Monolithic Stack problem means store the element in specfic order.
        int n1=nums1.length, n2=nums2.length;
        int numGreaterNext[]=new int[10001];
        Stack<Integer> st=new Stack<>();
        for(int i=n2-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            // if(st.isEmpty()){
            //     st.push(nums2[i]);
            //     num[i]=-1;
            // }
            // else if(st.peek()>nums2[i]){
            //     num[i]=st.peek();
            //     st.push(nums2[i]);
            // }
            // Instead i should write
            numGreaterNext[nums2[i]]=st.isEmpty() ? -1 : st.peek();
            st.push(nums2[i]);
        }
        for(int i=0;i<n1;i++){
            nums1[i]=numGreaterNext[nums1[i]];
        }
        return nums1;
    }
}
