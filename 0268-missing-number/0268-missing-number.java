class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length * (nums.length + 1)) / 2;
        int arr_sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            arr_sum = arr_sum + nums[i];
        }
        return sum - arr_sum;
    }
}