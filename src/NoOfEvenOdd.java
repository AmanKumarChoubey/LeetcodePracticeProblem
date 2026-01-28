class NoOfEvenOdd{
  public int[] evenOddBit(int n) {
        if(n==0) return new int[]{0,0};
        int cntEven=0, cntOdd=0, ind=0;
        while(n>0){
            if((ind&1)==0){
                if((n&1)==1) cntEven++;
            }
            else{
                if((n&1)==1) cntOdd++;
            }
            n>>=1;
            ind++;
        }
        return new int[]{cntEven,cntOdd};
    }
}
