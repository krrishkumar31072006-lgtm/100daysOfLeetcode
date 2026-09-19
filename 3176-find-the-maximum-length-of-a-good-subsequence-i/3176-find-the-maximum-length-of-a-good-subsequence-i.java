class Solution {
    int[][] dp;

    public int fun(int prev, int k, int[] nums){
       
        //if(i>=nums.length)return 0;
         if (dp[prev][k] != -1) {
            return dp[prev][k];
        }
        int a=0;
        
        for(int i=prev+1; i<nums.length;i++){
            if(nums[i]!=nums[prev] && k>0){
                a= Math.max(a,1+fun(i,k-1,nums));
            }else if(nums[i]==nums[prev]){
                a=Math.max(a,1+fun(i,k,nums));
            }
        }
        return dp[prev][k]=a;
       
       
    }
    public int maximumLength(int[] nums, int k) {
        dp = new int[nums.length][k + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
       
         int ans = 1;

        for (int i = 0; i < nums.length; i++) {
            ans = Math.max(ans, 1 + fun(i, k, nums));
        }

        return ans;
    }
}