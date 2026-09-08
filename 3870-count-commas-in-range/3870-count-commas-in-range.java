class Solution {
    public int countCommas(int n) {
        
        int t=n;
        int count=0;

        while(t>0){
            count++;
            t /= 10;
        }
        if(count<4){
            return 0;
        }
        
        int count2=0;
        for(int i=1000; i<=n;i++){
                 count2++;

        }
        return count2;
    }
}