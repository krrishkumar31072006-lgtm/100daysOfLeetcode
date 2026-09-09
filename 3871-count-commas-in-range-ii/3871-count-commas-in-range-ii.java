class Solution {
    public long countCommas(long n) {
        
      long temp=n;
        long count=0;
        long k=0;
        while(temp>0){
            count++;
            temp /= 10l;
        }

        if(count<4)return 0;
        if(count>=4){
            k += n-(long)Math.pow(10,3)+1;
        }
        if(count>=7){
            k += n-(long)Math.pow(10,6)+1;
        }
        if(count>=10){
             k += n-(long)Math.pow(10,9)+1;
        }
       if(count>=13){
             k += n-(long)Math.pow(10,12)+1;
        }
        if(count>=16){
            k += n-(long)Math.pow(10,15)+1;
        }
        return k;
        
    }
}