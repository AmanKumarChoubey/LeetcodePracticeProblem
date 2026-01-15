class RomanToInteger{
   public int romanToInt(String s) {
        int curr=0, prev=0, sum=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            switch(ch){
                case 'I':
                  curr=1;
                  break;

                case 'V':
                  curr=5;
                  break;

                case 'X':
                  curr=10;
                  break;

                case 'L':
                  curr=50;
                  break;

                case 'C':
                  curr=100;
                  break;

                case 'D':
                  curr=500;
                  break;

                case 'M':
                  curr=1000;
                  break;
            }
            if(prev>curr){
                sum-=curr;
            }
            else{
                sum+=curr;
            }
            prev=curr;
        }
        return sum;
    }
}
