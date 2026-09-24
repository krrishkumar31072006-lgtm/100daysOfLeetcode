// class Solution {
//     public int minimumDeleteSum(String s1, String s2) {
        
//     }
// }
class Solution {
    int dp[][];

    public int fun(int i, int j, String s, String t) {

        // if(i == s.length()) {
        //     return t.length() - j;
        // }

        // if(j == t.length()) {
        //     return s.length() - i;
        // }
         if(i==s.length()){
            int sum =0;
            while(j<t.length()){
                sum += (int)t.charAt(j);
                j++;
            }
            return sum;
         }  if(j==t.length()){
            int sum =0;
            while(i<s.length()){
                sum += (int)s.charAt(i);
                i++;
            }
            return sum;
         }



        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        if(s.charAt(i) == t.charAt(j)) {
            return dp[i][j] = fun(i+1, j+1, s, t);
        }
        else{
        int c1 = (int)t.charAt(j) + fun(i, j+1, s, t);
        int c2 = (int)s.charAt(i) + fun(i+1, j, s, t);

        return dp[i][j] = Math.min(c1, c2);
        }
    }

    public int minimumDeleteSum(String s1, String s2) {

        dp = new int[s1.length()][s2.length()];

        for(int i = 0; i < s1.length(); i++) {
            for(int j = 0; j < s2.length(); j++) {
                dp[i][j] = -1;
            }
        }

        return fun(0, 0, s1, s2);
    }
}