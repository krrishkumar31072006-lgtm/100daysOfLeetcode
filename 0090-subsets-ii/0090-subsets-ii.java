//input output approach

class Solution {
    public void sub(List<List<Integer>> ans,List<Integer> out,List<Integer> inp){
        if(!ans.contains(out)) ans.add(new ArrayList<>(out));
          if(inp.size() == 0) return ;
          for(int i = 0;i < inp.size();i++){
            if(i>0 && inp.get(i)==inp.get(i-1)) continue;
            List<Integer> newinp = new ArrayList<>(inp);
            List<Integer> newout = new ArrayList<>(out);
            newout.add(newinp.get(i));
            newinp.subList(0,i+1).clear();
            sub(ans,newout,newinp);
          }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> inp = new ArrayList<>();
        Arrays.sort(nums);
        for(int ele:nums) inp.add(ele);
        sub(ans,new ArrayList<>(),inp);
        return ans;

    }
}