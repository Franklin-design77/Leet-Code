class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        for(int i=k;k<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            max=Math.max(max,sum);
        }
        return max;
    }
}
