class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);

        int c=0;
        int size=0;

        while(c<g.length && size < s.length){
            if(g[c]<=s[size]){
                c++;
            }
            size++;
        }
        return c;
        
    }
}