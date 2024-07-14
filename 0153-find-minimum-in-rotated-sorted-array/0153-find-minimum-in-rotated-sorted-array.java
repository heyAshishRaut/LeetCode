class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        if(nums[low] < nums[high]){
            return nums[low];
        }
        while(low < high){
            int mid = (low + high) / 2;
            if(nums[mid] >= nums[0]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
}