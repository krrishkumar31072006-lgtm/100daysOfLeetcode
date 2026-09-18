
class Solution {
    int dp[][];
    public int fun(int i, int j, int[] s, int[] t){
        if(i>=s.length || j>=t.length){
            return 0;
        }
         if (dp[i][j] != -1) {
            return dp[i][j];
        }
         int c1=0;
         int c2=0;
        if(s[i]==t[j]){
             c1= 1+ fun(i+1,j+1,s,t);
        }
       else{
            c1= fun(i,j+1,s,t);
            c2=fun(i+1,j,s,t);
        }
         return dp[i][j] = Math.max(c1, c2);
       
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
          dp = new int[nums1.length+1][nums2.length+1];

        for (int i = 0; i < nums1.length; i++) {
            for(int j=0; j<nums2.length;j++){

            dp[i][j]=-1;
        }
        }
        return fun(0,0,nums1,nums2);
    }
}