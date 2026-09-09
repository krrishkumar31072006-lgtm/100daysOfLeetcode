class Solution {
    public int lengthOfLastWord(String s) {
       int r=s.length()-1;
       int count=0;
       while(r>=0 && !Character.isLetterOrDigit(s.charAt(r)))r--;
       while(r>=0 && Character.isLetterOrDigit(s.charAt(r))){
        count++;
        r--;
       }
       return count;
    }
}