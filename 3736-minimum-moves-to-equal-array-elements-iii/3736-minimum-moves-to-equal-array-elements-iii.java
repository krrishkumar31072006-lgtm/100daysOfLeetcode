class Solution {
    public int minMoves(int[] nums) {
        int max= Integer.MIN_VALUE;
        int ans=0;
        for(int i : nums) max= Math.max(max,i);

        for(int i: nums){
          ans += max- i;
        }
        return ans;
    }
}