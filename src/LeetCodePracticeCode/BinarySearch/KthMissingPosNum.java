class KthMissingPosNum{
  public int findKthPositive(int[] arr, int k) {
        // Brute Force Approach
        // Set<Integer> set=new HashSet<>();
        // int start=1;
        // for(int n:arr){
        //     set.add(n);
        // } 
        // while(k>0){
        //     if(!set.contains(start)){
        //         k--;
        //     }
        //     start++;
        // }
        // return start-1;

        // Optimised approach
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k) k++;
            else break;
        }
        return k;
    }
}
