class Solution {
    public void sub(List<List<Integer>> ans,int i,int nums[],List<Integer> out){
        if(i >= nums.length){
            if(!ans.contains(new ArrayList<>(out))){
            ans.add(new ArrayList<>(out));
            }
            return;
        }
        sub(ans,i+1,nums,out);
        out.add(nums[i]);
        sub(ans,i+1,nums,out);
        out.remove(out.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        sub(ans,0,nums,new ArrayList<>());
        return ans;
    }
}