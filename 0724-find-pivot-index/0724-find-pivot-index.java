class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(sum - nums[i] - left == 0 ) return i;

            left+=nums[i];
            sum-=nums[i];
        }
        return -1;
    }
}