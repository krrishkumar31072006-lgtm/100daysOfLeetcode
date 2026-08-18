class Solution {
    int fun(String s){
        int i=0;
        int j=s.length()-1;
        int cost=0;

        while(i<j){
             if(s.charAt(i)!=s.charAt(j)){
                int a1 = Math.abs((s.charAt(i)-'a')-(s.charAt(j)-'a'));
                int a2=26-a1;
                cost += Math.min(a1,a2);
             }
            i++;
            j--;
        }
        return cost;
    }


    public int minOperations(String s) {
      StringBuilder sb= new StringBuilder(s);
      int m = Integer.MAX_VALUE;

             for(int i =0;i<sb.length();i++){
                int cost= fun(sb.toString())+i;
                m=Math.min(m,cost);
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
          
       } 
       return m;
    }
}