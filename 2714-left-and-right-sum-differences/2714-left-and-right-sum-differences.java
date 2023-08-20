class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n= nums.length;
        int[] leftSum = new int[n];
        int left=0;
        int[] rightSum = new int[n];
        int right=0;
        int[] ans = new int[n];

        for(int i = 0 ; i < n ; i++){
            leftSum[i] = left;
            left += nums[i];

        }
        for(int i = n-1; i >= 0 ; i--){
            rightSum[i] = right;
            right += nums[i];
        }

        for(int i=0;i<n;i++){
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
return ans;
    }
}