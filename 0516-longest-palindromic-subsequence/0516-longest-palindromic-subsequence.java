
class Solution {
   static int dp[][];
    public int fun(int i, int j, String k,String t){
         if(i>=k.length() || j>=t.length()){
            return 0;
        }
         if (dp[i][j] != -1) {
            return dp[i][j];
        }
         int c1=0;
         int c2=0;
        if(k.charAt(i)==t.charAt(j)){
             c1= 1+ fun(i+1,j+1,k,t);
        }
       else{
            c1= fun(i+1,j,k,t);
            c2=fun(i,j+1,k,t);
        }
         return dp[i][j] = Math.max(c1,c2);

    }
    public int longestPalindromeSubseq(String s) {
        
       String a = new StringBuilder(s).reverse().toString();
        

         dp = new int[s.length()+1][a.length()+1];

        for (int i = 0; i < s.length(); i++) {
            for(int j=0; j<s.length();j++){

            dp[i][j]=-1;
        }
        }
       return fun(0,0,s,a);
    }
}