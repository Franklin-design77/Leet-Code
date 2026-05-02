class Solution {
    public int maxSubArray(int[] nums) {
        int mSum=nums[0];
        int cSum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(cSum>0){
                cSum+=nums[i];
            }
            else{
                cSum=nums[i];
            }
            mSum=Math.max(mSum,cSum);
        }
        return mSum;
    }
}