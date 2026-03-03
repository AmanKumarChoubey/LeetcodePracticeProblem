class PowerXtoN{
  public double myPow(double x, int n) {
       long num=n;
       if(num<0){
         x=1/x;
         num=-num;
       }
       double ans=1;
       while(num>0){
        // for odd
        if((num&1)==1){
            ans*=x;
        }
        x*=x;
        num>>=1;
       }
       return ans;
    }
}
