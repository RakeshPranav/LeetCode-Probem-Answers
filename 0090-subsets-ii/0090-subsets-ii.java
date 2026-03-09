class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> cur = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet();

        backtrack(set,cur,nums,0);
        return new ArrayList<>(set);
    }

    public static void backtrack(HashSet<List<Integer>> set , List<Integer> cur , int [] nums , int ind){
        
        set.add(new ArrayList<>(cur));

        for(int i=ind;i<nums.length;i++){

            cur.add(nums[i]);

            backtrack(set,cur,nums,i+1);

            cur.remove(cur.size()-1);
        }
    }
}