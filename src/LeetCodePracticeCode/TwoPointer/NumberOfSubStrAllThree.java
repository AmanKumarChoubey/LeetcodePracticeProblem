class NumberOfSubStrAllThree{
  public int numberOfSubstrings(String s) {
        
        int n=s.length(), count=0;
        // Brute Force Approach
        // for(int i=0;i<n;i++){
        //     int abcHash[]=new int[3];
        //     for(int j=i;j<n;j++){
        //         abcHash[s.charAt(j)-'a']=1;
        //         if(abcHash[0]+abcHash[1]+abcHash[2]==3){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        // Better Approch
        for(int i=0;i<n;i++){
            int abcHash[]=new int[3];
            for(int j=i;j<n;j++){
                abcHash[s.charAt(j)-'a']++;
                if(abcHash[0]>=1 && abcHash[1]>=1 && abcHash[2]>=1){
                    count+=(n-j);
                    break;
                }
            }
        }
        return count;
    }
}
