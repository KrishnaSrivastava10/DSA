class Solution {
    public int[] insertionSort(int[] nums) {
        insertion(nums,nums.length);
        return nums;
    }

    private void insertion(int[] nums,int n){
        for(int i=1;i<=n-1;i++){
            int j=i;
            while(j>0 && nums[j-1]>nums[j]){
                int temp = nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
    }
}
