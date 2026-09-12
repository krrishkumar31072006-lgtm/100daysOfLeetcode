class Solution {
    boolean check(int l,int r,String s){
        if(s.charAt(l)=='0')return false;
        int num = 0;
        for(int i= l;i <=r;i++){
            num = num * 2 + (s.charAt(i)-'0');
        }
         for(int i=0; i<=10;i++){
            int ak=(int) Math.pow(5,i);
            if(num == ak) return true;
         }
         return false;
     
     }



    public int fun(int p,int i,String s){
        if(i==s.length()-1){
            if(check(p,i,s)){
                return 0;
            }else{
                return Integer.MAX_VALUE;
            }
        }
        int ans = Integer.MAX_VALUE;
        if(check(p,i,s)){
            int a = fun(i+1,i+1,s);
            if(a != Integer.MAX_VALUE){
            ans = Math.min(ans,a+1);
            }
        }
        int a = fun(p,i+1,s);
        ans = Math.min(ans,a);
        return ans;

    }



    public int minimumBeautifulSubstrings(String s) {
       int ans = fun(0,0,s);
       return ans == Integer.MAX_VALUE ? -1 : ans+1;

    }
}