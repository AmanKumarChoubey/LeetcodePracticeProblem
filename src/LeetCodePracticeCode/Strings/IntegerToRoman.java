class IntegerToRoman{
  public String intToRoman(int num) {
        // write here.
        String []roman=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int []decimal=new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(num>0){
            if(num>=decimal[i]){
                sb.append(roman[i]);
                num-=decimal[i];
            }
            else{
                i++;
            }
        }
        return sb.toString();
    }
}
