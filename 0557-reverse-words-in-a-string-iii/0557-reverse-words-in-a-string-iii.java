class Solution {
    public String reverseWords(String s) {
        String[] words= s.split(" ");
        StringBuilder ans= new StringBuilder();

        for(int i=0; i<words.length; i++){
            StringBuilder sb= new StringBuilder(words[i]);
            sb.reverse();
            ans.append(sb);
            if(i != words.length -1)
            ans.append(" ");
        }
        return ans.toString();

    }
}