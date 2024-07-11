class Solution {
    public int[] buildArray(int[] nums) {
        int []newNums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            newNums[i] = nums[nums[i]];
        }
        return newNums;
    }
}