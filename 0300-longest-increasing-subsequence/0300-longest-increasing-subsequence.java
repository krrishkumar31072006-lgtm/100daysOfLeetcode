class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int a : nums) {
            if (tmp.size() == 0 || a > tmp.get(tmp.size() - 1)) {
                tmp.add(a);
            } else {
                for (int j = 0; j < tmp.size(); j++) {
                    if (tmp.get(j) >= a) {
                        tmp.set(j, a);
                        break;
                    }
                }
            }
        }

        for (int a : tmp) {
            System.out.print(a + " ");
        }

        return tmp.size();

    }
}