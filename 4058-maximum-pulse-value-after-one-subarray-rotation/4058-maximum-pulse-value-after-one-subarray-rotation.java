class Solution {

    long[][][][] dp;

    long NEG = -(long) 1e18;

    long fun(int i, int[] nums, int f, int sg, int pr) {

        if (i >= nums.length) {
            if (f == 1) return NEG;
            return 0;
        }

        int signIndex = (sg == 1) ? 1 : 0;
        int prevIndex = pr + 1;

        if (dp[i][f][signIndex][prevIndex] != NEG) {
            return dp[i][f][signIndex][prevIndex];
        }

        long crr = (long) nums[i] * sg;
        long m = NEG;

        if (f == 0) {

            long a = -crr + fun(i + 1, nums, 1, sg, i % 2);

            long b = crr + fun(i + 1, nums, 0, -sg, pr);

            m = Math.max(a, b);

        } else if (f == 1) {

            long a = crr + fun(i + 1, nums, 1, -sg, pr);

            m = a;

            if (i % 2 != pr) {

                long b = crr + fun(i + 1, nums, 2, sg, -1);

                m = Math.max(m, b);
            }

        } else {

            m = crr + fun(i + 1, nums, 2, -sg, pr);
        }

        return dp[i][f][signIndex][prevIndex] = m;
    }

    public long maxValue(int[] nums) {

        dp = new long[nums.length][3][2][3];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 3; l++) {
                        dp[i][j][k][l] = NEG;
                    }
                }
            }
        }

        return fun(0, nums, 0, 1, -1);
    }
}