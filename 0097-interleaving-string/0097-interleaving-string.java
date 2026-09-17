import java.util.*;

class Solution {

    int[][] dp = new int[1001][1001];

    int fun(int i, int j, int k,
            String s1, String s2, String s3) {

        if (k >= s3.length()) {
            return i >= s1.length() && j >= s2.length() ? 1 : 0;
        }

        if (i >= s1.length()) {
            while (j < s2.length() && k < s3.length()) {
                if (s2.charAt(j) == s3.charAt(k)) {
                    j++;
                    k++;
                } else {
                    return 0;
                }
            }

            return j >= s2.length() && k >= s3.length() ? 1 : 0;
        }

        if (j >= s2.length()) {
              while (i < s1.length() && k < s3.length()) {
                 if (s1.charAt(i) == s3.charAt(k)) {
                    i++;
                    k++;
                } else {
                    return 0;
                }
            }

            return i >= s1.length() && k >= s3.length() ? 1 : 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int m = 0;

        if (s1.charAt(i) == s3.charAt(k)) {
            int a = fun(i + 1, j, k + 1, s1, s2, s3);
            m |= a;
        }

        if (s2.charAt(j) == s3.charAt(k)) {
            int a = fun(i, j + 1, k + 1, s1, s2, s3);
            m |= a;
        }

        return dp[i][j] = m;
    }

    public boolean isInterleave(String s1, String s2, String s3) {

        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        for (int i = 0; i < 1001; i++) {
            Arrays.fill(dp[i], -1);
        }

        return fun(0, 0, 0, s1, s2, s3) == 1;
    }
}