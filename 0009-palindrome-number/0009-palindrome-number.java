class Solution {
    public boolean isPalindrome(int x) {
       int rev = 0;
       int num = x;
       while(x>0){
        int ld = x%10;
        rev = rev*10;
        rev = rev + ld;
        x = x/10;
       } 
       if (rev == num){
        
        return true;

       }
       return false;
    }
}