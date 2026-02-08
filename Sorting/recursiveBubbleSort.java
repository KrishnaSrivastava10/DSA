class Solution {
    public int[] bubbleSort(int[] nums) {
        bubble(nums,nums.length);
        return nums;
    }

    private void bubble(int[] nums,int n){
        if (n == 1) return;

        for(int j=0;j<=n-2;j++){
            if(nums[j]>nums[j+1]){
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
        bubble(nums,n-1);
    }
}
