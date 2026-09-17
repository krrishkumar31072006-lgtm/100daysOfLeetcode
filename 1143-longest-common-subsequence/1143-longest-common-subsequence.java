class Solution {
    int dp[][];
    public int fun(int i, int j, String s, String t){
        if(i>=s.length() || j>=t.length()){
            return 0;
        }
         if (dp[i][j] != -1) {
            return dp[i][j];
        }
         int c1=0;
         int c2=0;
        if(s.charAt(i)==t.charAt(j)){
             c1= 1+ fun(i+1,j+1,s,t);
        }
       else{
            c1= fun(i,j+1,s,t);
            c2=fun(i+1,j,s,t);
        }
         return dp[i][j] = Math.max(c1, c2);
       
    }
    public int longestCommonSubsequence(String text1, String text2) {
          dp = new int[text1.length()+1][text2.length()+1];

        for (int i = 0; i < text1.length(); i++) {
            for(int j=0; j<text2.length();j++){

            dp[i][j]=-1;
        }
        }
        return fun(0,0,text1,text2);
    }
}