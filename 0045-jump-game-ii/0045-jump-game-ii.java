class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        dp[n-1] = 0;
        for(int i = n-2;i>=0;i--){
            int minimum = Integer.MAX_VALUE;
            for(int j = 1;j <= nums[i];j++){
            if(i + j < n){
             int ans = dp[i+j];
             if(ans != Integer.MAX_VALUE){
             minimum = Math.min(minimum,1 + ans);
             }
            }
            }
            dp[i] = minimum;
        }
        return dp[0];
    }
}