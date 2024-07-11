class Solution {
    public int[] searchRange(int[] nums, int target) {
        int idx = 0;
        int []ans = {-1, -1};
        while(idx < nums.length){
            if(nums[idx] == target){
                ans[0] = idx;
                break;
            }
            idx++;
        }
        idx = nums.length - 1;
        while(idx >= 0){
            if(nums[idx] == target){
                ans[1] = idx;
                break;
            }
            idx--;
        }
        return ans;
    }
}