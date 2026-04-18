class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int sum=0;
            for(int j=i;j<k+i;j++){
                sum=nums[j]+sum;
            }
            max=Math.max(sum,max);
            
        }
        return (double)max/k;
    }
}