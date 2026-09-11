class Solution {

    
     int[] dp;
public int fun(int i,int[] days,int[] costs){
     if(i>=days.length)return 0;
     if (dp[i] != -1) return dp[i];

     int curr= days[i];

     int one = costs[0]+ fun(i+1,days,costs);
     int id1=days.length;
     int id2=days.length;

     int seven,thirty;
     for(int j=i+1;j<days.length;j++){
        if(days[j]>=curr+7){
            id1=j;
            break;
        }
      }
       for(int j=i+1;j<days.length;j++){
        if(days[j]>=curr+30){
            id2=j;
            break;

        }
      }
       seven=costs[1]+fun(id1,days,costs);
       thirty=costs[2]+fun(id2,days,costs);
       return dp[i] = Math.min(one, Math.min(seven, thirty));

}



    public int mincostTickets(int[] days, int[] costs) {
        dp = new int[days.length];
        Arrays.fill(dp, -1);

         return fun(0,days,costs);

    }
}