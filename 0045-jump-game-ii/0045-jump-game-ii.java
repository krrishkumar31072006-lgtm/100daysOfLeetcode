
import java.util.Arrays;

class Solution {

    public int jump(int[] nums) {
        int n = nums.length;

        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        solve(nums, dp);
        return dp[n - 1];
    }

    public void solve(int[] nums, int[] dp) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (dp[i] == Integer.MAX_VALUE) {
                continue;
            }
            for (int j = i + 1;
                 j < n && j <= i + nums[i];
                 j++) {

                dp[j] = Math.min(dp[j], dp[i] + 1);
            }
        }
    }
}
